/*   Copyright 2004 The Apache Software Foundation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.xmlbeans.impl.marshal;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.impl.binding.bts.BindingLoader;
import org.apache.xmlbeans.impl.binding.bts.BindingType;
import org.apache.xmlbeans.impl.binding.bts.BindingTypeName;
import org.apache.xmlbeans.impl.binding.bts.WrappedArrayType;
import org.apache.xmlbeans.impl.marshal.util.collections.Accumulator;
import org.apache.xmlbeans.impl.marshal.util.collections.AccumulatorFactory;

import javax.xml.namespace.QName;
import java.lang.reflect.Array;

final class WrappedArrayRuntimeBindingType
    extends RuntimeBindingType
{
    private final WrappedArrayType wrappedArrayType;

    private ItemProperty elementProperty;

    WrappedArrayRuntimeBindingType(WrappedArrayType binding_type)
        throws XmlException
    {
        super(binding_type);
        wrappedArrayType = binding_type;
    }

    void accept(RuntimeTypeVisitor visitor)
        throws XmlException
    {
        visitor.visit(this);
    }

    public void initialize(RuntimeBindingTypeTable typeTable,
                           BindingLoader bindingLoader)
        throws XmlException
    {
        final BindingTypeName item_type_name = wrappedArrayType.getItemType();
        assert item_type_name != null;

        final BindingType item_type = bindingLoader.getBindingType(item_type_name);
        if (item_type == null) {
            final String msg = "unable to lookup " + item_type_name +
                " from type " + wrappedArrayType;
            throw new XmlException(msg);
        }

        final RuntimeBindingType item_rtt =
            typeTable.createRuntimeType(item_type, bindingLoader);

        elementProperty =
            new ItemProperty(this, wrappedArrayType.getItemName(),
                             item_rtt,
                             wrappedArrayType.isItemNillable());


    }

    boolean hasElementChildren()
    {
        return true;
    }

    ItemProperty getElementProperty()
    {
        assert elementProperty != null;
        return elementProperty;
    }

    protected Object createIntermediary(UnmarshalResult context)
    {
        return AccumulatorFactory.createAccumulator(getJavaType(),
                                                    elementProperty.getElementClass());
    }

    protected Object createIntermediary(UnmarshalResult context,
                                        Object actual_object)
    {
        //cannot modify the length of an array once it is created...
        final String e = "factories not supported for array types: " +
            getBindingType();
        throw new UnsupportedOperationException(e);
    }

    protected Object getFinalObjectFromIntermediary(Object inter,
                                                    UnmarshalResult context)
        throws XmlException
    {
        Accumulator acc = (Accumulator)inter;
        return acc.getFinalArray();
    }

    boolean isObjectFromIntermediateIdempotent()
    {
        return false;
    }

    static final class ItemProperty
        extends RuntimeBindingProperty
    {
        private final QName itemName;
        private final RuntimeBindingType itemType;
        private final boolean nillable;

        ItemProperty(RuntimeBindingType containing_type,
                     QName item_name,
                     RuntimeBindingType item_type,
                     boolean nillable)
            throws XmlException
        {
            super(containing_type);

            itemName = item_name;
            itemType = item_type;
            this.nillable = nillable;

        }

        Class getElementClass()
        {
            return itemType.getJavaType();
        }

        RuntimeBindingType getRuntimeBindingType()
        {
            return itemType;
        }

        RuntimeBindingType getActualRuntimeType(Object property_value,
                                                MarshalResult result)
            throws XmlException
        {
            return result.determineRuntimeBindingType(itemType, property_value);
        }

        QName getName()
        {
            return itemName;
        }

        public void fill(Object inter, Object prop_obj)
            throws XmlException
        {
            Accumulator acc = (Accumulator)inter;
            acc.append(prop_obj);
        }

        protected void fillPlaceholder(Object inter)
        {
            Accumulator acc = (Accumulator)inter;
            acc.appendDefault();
        }

        //non index properties can return unsupported...
        protected int getSize(Object inter)
        {
            Accumulator acc = (Accumulator)inter;
            return acc.size();
        }

        protected void fill(Object final_obj, int index, Object prop_val)
        {
            assert final_obj != null;
            assert !(final_obj instanceof Accumulator);

            //TODO: fix case for collections.  Can only work with List types
            assert final_obj.getClass().isArray();

            Array.set(final_obj, index, prop_val);
        }


        Object getValue(Object parentObject, MarshalResult result)
            throws XmlException
        {
            throw new UnsupportedOperationException("use 3 arg getValue");
        }

        Object getValue(Object parentObject, MarshalResult result, int item_index)
            throws XmlException
        {
            return Array.get(parentObject, item_index);
        }

        boolean isSet(Object parentObject, MarshalResult result)
            throws XmlException
        {
            throw new UnsupportedOperationException("use 3 arg isSet");
        }

        boolean isSet(Object parentObject, MarshalResult result, int item_index)
            throws XmlException
        {
            if (nillable) return true;
            if (itemType.isJavaPrimitive()) return true;

            //TODO: consider isSet for array elements?

            return getValue(parentObject, result, item_index) != null;
        }

        boolean isMultiple()
        {
            return true;
        }

        boolean isNillable()
        {
            return nillable;
        }

        String getLexicalDefault()
        {
            return null;
        }
    }
}

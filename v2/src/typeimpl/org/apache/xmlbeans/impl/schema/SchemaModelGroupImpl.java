/*
* The Apache Software License, Version 1.1
*
*
* Copyright (c) 2003 The Apache Software Foundation.  All rights 
* reserved.
*
* Redistribution and use in source and binary forms, with or without
* modification, are permitted provided that the following conditions
* are met:
*
* 1. Redistributions of source code must retain the above copyright
*    notice, this list of conditions and the following disclaimer. 
*
* 2. Redistributions in binary form must reproduce the above copyright
*    notice, this list of conditions and the following disclaimer in
*    the documentation and/or other materials provided with the
*    distribution.
*
* 3. The end-user documentation included with the redistribution,
*    if any, must include the following acknowledgment:  
*       "This product includes software developed by the
*        Apache Software Foundation (http://www.apache.org/)."
*    Alternately, this acknowledgment may appear in the software itself,
*    if and wherever such third-party acknowledgments normally appear.
*
* 4. The names "Apache" and "Apache Software Foundation" must 
*    not be used to endorse or promote products derived from this
*    software without prior written permission. For written 
*    permission, please contact apache@apache.org.
*
* 5. Products derived from this software may not be called "Apache 
*    XMLBeans", nor may "Apache" appear in their name, without prior 
*    written permission of the Apache Software Foundation.
*
* THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
* OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
* DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
* ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
* SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
* LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
* USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
* ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
* OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
* OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
* SUCH DAMAGE.
* ====================================================================
*
* This software consists of voluntary contributions made by many
* individuals on behalf of the Apache Software Foundation and was
* originally based on software copyright (c) 2000-2003 BEA Systems 
* Inc., <http://www.bea.com/>. For more information on the Apache Software
* Foundation, please see <http://www.apache.org/>.
*/

package org.apache.xmlbeans.impl.schema;

import org.apache.xmlbeans.SchemaAnnotation;
import org.apache.xmlbeans.SchemaComponent;
import org.apache.xmlbeans.SchemaModelGroup;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.SchemaTypeSystem;
import javax.xml.namespace.QName;

public class SchemaModelGroupImpl implements SchemaModelGroup
{
    private SchemaTypeSystem _typeSystem;
    private QName _name;
    private XmlObject _parseObject;
    private String _parseTNS;
    private boolean _chameleon;
    private boolean _redefinition;
    private SchemaAnnotation _annotation;

    public SchemaModelGroupImpl(SchemaTypeSystem typeSystem)
    {
        _typeSystem = typeSystem;
    }

    public SchemaModelGroupImpl(SchemaTypeSystem typeSystem, QName name)
    {
        this(typeSystem);
        _name = name;
    }

    public void init(QName name, String targetNamespace, boolean chameleon, boolean redefinition, XmlObject x, SchemaAnnotation a)
    {
        assert _name == null || name.equals( _name );
        
        _name = name;
        _parseTNS = targetNamespace;
        _chameleon = chameleon;
        _redefinition = redefinition;
        _parseObject = x;
        _annotation = a;
    }

    public SchemaTypeSystem getTypeSystem()
    {
        return _typeSystem;
    }

    public int getComponentType()
        { return SchemaComponent.MODEL_GROUP; }

    public QName getName()
        { return _name; }

    public XmlObject getParseObject()
        { return _parseObject; }

    public String getTargetNamespace()
        { return _parseTNS; }

    public String getChameleonNamespace()
        { return _chameleon ? _parseTNS : null; }
    
    public boolean isRedefinition()
        { return _redefinition; }

    public SchemaAnnotation getAnnotation()
        { return _annotation; }

    private SchemaModelGroup.Ref _selfref = new SchemaModelGroup.Ref(this);
    
    public SchemaModelGroup.Ref getRef()
        { return _selfref; }

    public SchemaComponent.Ref getComponentRef()
        { return getRef(); }
}

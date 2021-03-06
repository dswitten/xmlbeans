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

package org.apache.xmlbeans;

import java.util.List;


/**
 * Corresponds to the XML Schema
 * <a target="_blank" href="http://www.w3.org/TR/xmlschema-2/#IDREFS">xs:IDREFS</a> type,
 * a list type.
 * <p>
 * When validated, IDREF values must match an ID value that is present within
 * the document. This rule is only verified when a whole document is validated
 * at once.
 * <p>
 * Convertible to a {@link List}.
 */
public interface XmlIDREFS extends XmlAnySimpleType {
    /**
     * The constant {@link SchemaType} object representing this schema type.
     */
    SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_IDREFS");

    /**
     * Returns the value as a {@link List} of {@link String} values
     */
    List getListValue();

    /**
     * Returns the value as a {@link List} of {@link XmlIDREF} values
     */
    List xgetListValue();

    /**
     * Sets the value as a {@link List}
     */
    void setListValue(List<?> l);

    /**
     * A class with methods for creating instances
     * of {@link XmlIDREFS}.
     */
    final class Factory {
        /**
         * Creates an empty instance of {@link XmlIDREFS}
         */
        public static XmlIDREFS newInstance() {
            return (XmlIDREFS) XmlBeans.getContextTypeLoader().newInstance(type, null);
        }

        /**
         * Creates an empty instance of {@link XmlIDREFS}
         */
        public static XmlIDREFS newInstance(org.apache.xmlbeans.XmlOptions options) {
            return (XmlIDREFS) XmlBeans.getContextTypeLoader().newInstance(type, options);
        }

        /**
         * Creates an immutable {@link XmlIDREFS} value
         */
        public static XmlIDREFS newValue(Object obj) {
            return (XmlIDREFS) type.newValue(obj);
        }

        /**
         * Parses a {@link XmlIDREFS} fragment from a String.
         */
        public static XmlIDREFS parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
            return (XmlIDREFS) XmlBeans.getContextTypeLoader().parse(s, type, null);
        }

        /**
         * Parses a {@link XmlIDREFS} fragment from a String.
         */
        public static XmlIDREFS parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
            return (XmlIDREFS) XmlBeans.getContextTypeLoader().parse(s, type, options);
        }

        /**
         * Parses a {@link XmlIDREFS} fragment from a File.
         */
        public static XmlIDREFS parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlIDREFS) XmlBeans.getContextTypeLoader().parse(f, type, null);
        }

        /**
         * Parses a {@link XmlIDREFS} fragment from a File.
         */
        public static XmlIDREFS parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlIDREFS) XmlBeans.getContextTypeLoader().parse(f, type, options);
        }

        /**
         * Parses a {@link XmlIDREFS} fragment from a URL.
         */
        public static XmlIDREFS parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlIDREFS) XmlBeans.getContextTypeLoader().parse(u, type, null);
        }

        /**
         * Parses a {@link XmlIDREFS} fragment from a URL.
         */
        public static XmlIDREFS parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlIDREFS) XmlBeans.getContextTypeLoader().parse(u, type, options);
        }

        /**
         * Parses a {@link XmlIDREFS} fragment from an InputStream.
         */
        public static XmlIDREFS parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlIDREFS) XmlBeans.getContextTypeLoader().parse(is, type, null);
        }

        /**
         * Parses a {@link XmlIDREFS} fragment from an InputStream.
         */
        public static XmlIDREFS parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlIDREFS) XmlBeans.getContextTypeLoader().parse(is, type, options);
        }

        /**
         * Parses a {@link XmlIDREFS} fragment from a Reader.
         */
        public static XmlIDREFS parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlIDREFS) XmlBeans.getContextTypeLoader().parse(r, type, null);
        }

        /**
         * Parses a {@link XmlIDREFS} fragment from a Reader.
         */
        public static XmlIDREFS parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlIDREFS) XmlBeans.getContextTypeLoader().parse(r, type, options);
        }

        /**
         * Parses a {@link XmlIDREFS} fragment from a DOM Node.
         */
        public static XmlIDREFS parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (XmlIDREFS) XmlBeans.getContextTypeLoader().parse(node, type, null);
        }

        /**
         * Parses a {@link XmlIDREFS} fragment from a DOM Node.
         */
        public static XmlIDREFS parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
            return (XmlIDREFS) XmlBeans.getContextTypeLoader().parse(node, type, options);
        }

        /**
         * Parses a {@link XmlIDREFS} fragment from an XMLStreamReader.
         */
        public static XmlIDREFS parse(javax.xml.stream.XMLStreamReader xsr) throws org.apache.xmlbeans.XmlException {
            return (XmlIDREFS) XmlBeans.getContextTypeLoader().parse(xsr, type, null);
        }

        /**
         * Parses a {@link XmlIDREFS} fragment from an XMLStreamReader.
         */
        public static XmlIDREFS parse(javax.xml.stream.XMLStreamReader xsr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
            return (XmlIDREFS) XmlBeans.getContextTypeLoader().parse(xsr, type, options);
        }

        private Factory() {
            // No instance of this class allowed
        }
    }
}


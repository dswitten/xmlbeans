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

/**
 * Corresponds to the XML Schema
 * <a target="_blank" href="http://www.w3.org/TR/xmlschema-2/#IDREF">xs:IDREF</a> type.
 * <p>
 * When validated, IDREF values must match an ID value that is present within
 * the document. This rule is only verified when a whole document is validated
 * at once.
 * <p>
 * Convertible to a {@link String}.
 */
public interface XmlIDREF extends XmlNCName {
    /**
     * The constant {@link SchemaType} object representing this schema type.
     */
    SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_IDREF");

    /**
     * A class with methods for creating instances
     * of {@link XmlIDREF}.
     */
    final class Factory {
        /**
         * Creates an empty instance of {@link XmlIDREF}
         */
        public static XmlIDREF newInstance() {
            return (XmlIDREF) XmlBeans.getContextTypeLoader().newInstance(type, null);
        }

        /**
         * Creates an empty instance of {@link XmlIDREF}
         */
        public static XmlIDREF newInstance(org.apache.xmlbeans.XmlOptions options) {
            return (XmlIDREF) XmlBeans.getContextTypeLoader().newInstance(type, options);
        }

        /**
         * Creates an immutable {@link XmlIDREF} value
         */
        public static XmlIDREF newValue(Object obj) {
            return (XmlIDREF) type.newValue(obj);
        }

        /**
         * Parses a {@link XmlIDREF} fragment from a String.
         */
        public static XmlIDREF parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
            return (XmlIDREF) XmlBeans.getContextTypeLoader().parse(s, type, null);
        }

        /**
         * Parses a {@link XmlIDREF} fragment from a String.
         */
        public static XmlIDREF parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
            return (XmlIDREF) XmlBeans.getContextTypeLoader().parse(s, type, options);
        }

        /**
         * Parses a {@link XmlIDREF} fragment from a File.
         */
        public static XmlIDREF parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlIDREF) XmlBeans.getContextTypeLoader().parse(f, type, null);
        }

        /**
         * Parses a {@link XmlIDREF} fragment from a File.
         */
        public static XmlIDREF parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlIDREF) XmlBeans.getContextTypeLoader().parse(f, type, options);
        }

        /**
         * Parses a {@link XmlIDREF} fragment from a URL.
         */
        public static XmlIDREF parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlIDREF) XmlBeans.getContextTypeLoader().parse(u, type, null);
        }

        /**
         * Parses a {@link XmlIDREF} fragment from a URL.
         */
        public static XmlIDREF parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlIDREF) XmlBeans.getContextTypeLoader().parse(u, type, options);
        }

        /**
         * Parses a {@link XmlIDREF} fragment from an InputStream.
         */
        public static XmlIDREF parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlIDREF) XmlBeans.getContextTypeLoader().parse(is, type, null);
        }

        /**
         * Parses a {@link XmlIDREF} fragment from an InputStream.
         */
        public static XmlIDREF parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlIDREF) XmlBeans.getContextTypeLoader().parse(is, type, options);
        }

        /**
         * Parses a {@link XmlIDREF} fragment from a Reader.
         */
        public static XmlIDREF parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlIDREF) XmlBeans.getContextTypeLoader().parse(r, type, null);
        }

        /**
         * Parses a {@link XmlIDREF} fragment from a Reader.
         */
        public static XmlIDREF parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlIDREF) XmlBeans.getContextTypeLoader().parse(r, type, options);
        }

        /**
         * Parses a {@link XmlIDREF} fragment from a DOM Node.
         */
        public static XmlIDREF parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (XmlIDREF) XmlBeans.getContextTypeLoader().parse(node, type, null);
        }

        /**
         * Parses a {@link XmlIDREF} fragment from a DOM Node.
         */
        public static XmlIDREF parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
            return (XmlIDREF) XmlBeans.getContextTypeLoader().parse(node, type, options);
        }

        /**
         * Parses a {@link XmlIDREF} fragment from an XMLStreamReader.
         */
        public static XmlIDREF parse(javax.xml.stream.XMLStreamReader xsr) throws org.apache.xmlbeans.XmlException {
            return (XmlIDREF) XmlBeans.getContextTypeLoader().parse(xsr, type, null);
        }

        /**
         * Parses a {@link XmlIDREF} fragment from an XMLStreamReader.
         */
        public static XmlIDREF parse(javax.xml.stream.XMLStreamReader xsr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
            return (XmlIDREF) XmlBeans.getContextTypeLoader().parse(xsr, type, options);
        }

        private Factory() {
            // No instance of this class allowed
        }
    }
}


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
 * <a target="_blank" href="http://www.w3.org/TR/xmlschema-2/#duration">xs:duration</a> type.
 * <p>
 * Convertible to a {@link GDuration}.
 *
 * @see GDuration
 */
public interface XmlDuration extends XmlAnySimpleType {
    /**
     * The constant {@link SchemaType} object representing this schema type.
     */
    SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_duration");

    /**
     * Returns this value as a {@link GDuration}
     */
    GDuration getGDurationValue();

    /**
     * Sets this value as a {@link GDuration}
     */
    void setGDurationValue(GDuration gd);

    /**
     * A class with methods for creating instances
     * of {@link XmlDuration}.
     */
    final class Factory {
        /**
         * Creates an empty instance of {@link XmlDuration}
         */
        public static XmlDuration newInstance() {
            return (XmlDuration) XmlBeans.getContextTypeLoader().newInstance(type, null);
        }

        /**
         * Creates an empty instance of {@link XmlDuration}
         */
        public static XmlDuration newInstance(org.apache.xmlbeans.XmlOptions options) {
            return (XmlDuration) XmlBeans.getContextTypeLoader().newInstance(type, options);
        }

        /**
         * Creates an immutable {@link XmlDuration} value
         */
        public static XmlDuration newValue(Object obj) {
            return (XmlDuration) type.newValue(obj);
        }

        /**
         * Parses a {@link XmlDuration} fragment from a String. For example: "<code>&lt;xml-fragment&gt;P1Y2MT2H&lt;/xml-fragment&gt;</code>".
         */
        public static XmlDuration parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
            return (XmlDuration) XmlBeans.getContextTypeLoader().parse(s, type, null);
        }

        /**
         * Parses a {@link XmlDuration} fragment from a String. For example: "<code>&lt;xml-fragment&gt;P1Y2MT2H&lt;/xml-fragment&gt;</code>".
         */
        public static XmlDuration parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
            return (XmlDuration) XmlBeans.getContextTypeLoader().parse(s, type, options);
        }

        /**
         * Parses a {@link XmlDuration} fragment from a File.
         */
        public static XmlDuration parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlDuration) XmlBeans.getContextTypeLoader().parse(f, type, null);
        }

        /**
         * Parses a {@link XmlDuration} fragment from a File.
         */
        public static XmlDuration parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlDuration) XmlBeans.getContextTypeLoader().parse(f, type, options);
        }

        /**
         * Parses a {@link XmlDuration} fragment from a URL.
         */
        public static XmlDuration parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlDuration) XmlBeans.getContextTypeLoader().parse(u, type, null);
        }

        /**
         * Parses a {@link XmlDuration} fragment from a URL.
         */
        public static XmlDuration parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlDuration) XmlBeans.getContextTypeLoader().parse(u, type, options);
        }

        /**
         * Parses a {@link XmlDuration} fragment from an InputStream.
         */
        public static XmlDuration parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlDuration) XmlBeans.getContextTypeLoader().parse(is, type, null);
        }

        /**
         * Parses a {@link XmlDuration} fragment from an InputStream.
         */
        public static XmlDuration parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlDuration) XmlBeans.getContextTypeLoader().parse(is, type, options);
        }

        /**
         * Parses a {@link XmlDuration} fragment from a Reader.
         */
        public static XmlDuration parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlDuration) XmlBeans.getContextTypeLoader().parse(r, type, null);
        }

        /**
         * Parses a {@link XmlDuration} fragment from a Reader.
         */
        public static XmlDuration parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlDuration) XmlBeans.getContextTypeLoader().parse(r, type, options);
        }

        /**
         * Parses a {@link XmlDuration} fragment from a DOM Node.
         */
        public static XmlDuration parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (XmlDuration) XmlBeans.getContextTypeLoader().parse(node, type, null);
        }

        /**
         * Parses a {@link XmlDuration} fragment from a DOM Node.
         */
        public static XmlDuration parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
            return (XmlDuration) XmlBeans.getContextTypeLoader().parse(node, type, options);
        }

        /**
         * Parses a {@link XmlDuration} fragment from an XMLStreamReader.
         */
        public static XmlDuration parse(javax.xml.stream.XMLStreamReader xsr) throws org.apache.xmlbeans.XmlException {
            return (XmlDuration) XmlBeans.getContextTypeLoader().parse(xsr, type, null);
        }

        /**
         * Parses a {@link XmlDuration} fragment from an XMLStreamReader.
         */
        public static XmlDuration parse(javax.xml.stream.XMLStreamReader xsr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
            return (XmlDuration) XmlBeans.getContextTypeLoader().parse(xsr, type, options);
        }

        private Factory() {
            // No instance of this class allowed
        }
    }
}


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
 * <a target="_blank" href="http://www.w3.org/TR/xmlschema-2/#byte">xs:byte</a> type.
 * <p>
 * Naturally, convertible to Java byte.
 */
public interface XmlByte extends XmlShort {
    /**
     * The constant {@link SchemaType} object representing this schema type.
     */
    SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_byte");

    /**
     * Returns this value as a byte
     */
    byte getByteValue();

    /**
     * Sets this value as a byte
     */
    void setByteValue(byte s);

    /**
     * A class with methods for creating instances
     * of {@link XmlByte}.
     */
    final class Factory {
        /**
         * Creates an empty instance of {@link XmlByte}
         */
        static XmlByte newInstance() {
            return (XmlByte) XmlBeans.getContextTypeLoader().newInstance(type, null);
        }

        /**
         * Creates an empty instance of {@link XmlByte}
         */
        static XmlByte newInstance(org.apache.xmlbeans.XmlOptions options) {
            return (XmlByte) XmlBeans.getContextTypeLoader().newInstance(type, options);
        }

        /**
         * Creates an immutable {@link XmlByte} value
         */
        static XmlByte newValue(Object obj) {
            return (XmlByte) type.newValue(obj);
        }

        /**
         * Parses a {@link XmlByte} fragment from a String. For example: "<code>&lt;xml-fragment&gt;123&lt;/xml-fragment&gt;</code>".
         */
        static XmlByte parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
            return (XmlByte) XmlBeans.getContextTypeLoader().parse(s, type, null);
        }

        /**
         * Parses a {@link XmlByte} fragment from a String. For example: "<code>&lt;xml-fragment&gt;123&lt;/xml-fragment&gt;</code>".
         */
        static XmlByte parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
            return (XmlByte) XmlBeans.getContextTypeLoader().parse(s, type, options);
        }

        /**
         * Parses a {@link XmlByte} fragment from a File.
         */
        static XmlByte parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlByte) XmlBeans.getContextTypeLoader().parse(f, type, null);
        }

        /**
         * Parses a {@link XmlByte} fragment from a File.
         */
        static XmlByte parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlByte) XmlBeans.getContextTypeLoader().parse(f, type, options);
        }

        /**
         * Parses a {@link XmlByte} fragment from a URL.
         */
        static XmlByte parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlByte) XmlBeans.getContextTypeLoader().parse(u, type, null);
        }

        /**
         * Parses a {@link XmlByte} fragment from a URL.
         */
        static XmlByte parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlByte) XmlBeans.getContextTypeLoader().parse(u, type, options);
        }

        /**
         * Parses a {@link XmlByte} fragment from an InputStream.
         */
        static XmlByte parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlByte) XmlBeans.getContextTypeLoader().parse(is, type, null);
        }

        /**
         * Parses a {@link XmlByte} fragment from an InputStream.
         */
        static XmlByte parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlByte) XmlBeans.getContextTypeLoader().parse(is, type, options);
        }

        /**
         * Parses a {@link XmlByte} fragment from a Reader.
         */
        static XmlByte parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlByte) XmlBeans.getContextTypeLoader().parse(r, type, null);
        }

        /**
         * Parses a {@link XmlByte} fragment from a Reader.
         */
        static XmlByte parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
            return (XmlByte) XmlBeans.getContextTypeLoader().parse(r, type, options);
        }

        /**
         * Parses a {@link XmlByte} fragment from a DOM Node.
         */
        static XmlByte parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
            return (XmlByte) XmlBeans.getContextTypeLoader().parse(node, type, null);
        }

        /**
         * Parses a {@link XmlByte} fragment from a DOM Node.
         */
        static XmlByte parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
            return (XmlByte) XmlBeans.getContextTypeLoader().parse(node, type, options);
        }

        /**
         * Parses a {@link XmlByte} fragment from an XMLStreamReader.
         */
        static XmlByte parse(javax.xml.stream.XMLStreamReader xsr) throws org.apache.xmlbeans.XmlException {
            return (XmlByte) XmlBeans.getContextTypeLoader().parse(xsr, type, null);
        }

        /**
         * Parses a {@link XmlByte} fragment from an XMLStreamReader.
         */
        static XmlByte parse(javax.xml.stream.XMLStreamReader xsr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
            return (XmlByte) XmlBeans.getContextTypeLoader().parse(xsr, type, options);
        }

        private Factory() {
            // No instance of this class allowed
        }
    }
}


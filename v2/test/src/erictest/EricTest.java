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

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.XMLReader;
import org.apache.xmlbeans.impl.store.Root;
import org.apache.xmlbeans.impl.tool.CodeGenUtil;
import org.apache.xmlbeans.impl.tool.SchemaCompiler;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.SchemaTypeSystem;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlCursor.TokenType;
import org.apache.xmlbeans.XmlCursor.XmlBookmark;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.GDateBuilder;
import org.apache.xmlbeans.XmlDate;
import org.apache.xmlbeans.XmlDocumentProperties;
import org.apache.xmlbeans.XmlError;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlInt;
import org.apache.xmlbeans.XmlInteger;
import org.apache.xmlbeans.XmlLineNumber;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.ref.WeakReference;
import java.lang.ref.ReferenceQueue;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.xml.namespace.QName;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.w3.x2001.xmlSchema.*;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.apache.xmlbeans.xml.stream.XMLEvent;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLName;
import org.apache.xml.xmlbeans.x2004.x02.xbean.config.ConfigDocument;
import javax.xml.stream.XMLStreamReader;

import org.w3c.dom.Node;
import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.EntityReference;
import org.w3c.dom.Text;
import org.w3c.dom.CharacterData;
import org.w3c.dom.DocumentType;
import org.w3c.dom.NodeList;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.NamedNodeMap;

import javax.xml.stream.XMLStreamReader;

import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.xmlbeans.impl.newstore2.Public2;

public class EricTest
{
    public static void main ( String[] args ) throws Exception
    {
        XmlCursor c = Public2.newStore();

        c.toNextToken();

        c.beginElement( "foo" );
        c.insertAttributeWithValue( "a1", "<>><<" );
        c.insertComment( "comment" );
        c.insertProcInst( "target", "value" );
        c.insertElementWithText( "gag", "text" );

        c.toStartDoc();

        System.out.println( c.xmlText() );


//        Document doc = Public2.parse( "<a/>" );
//
//        Node n = doc.createCDATASection( "asas" );
//        System.out.println( n.getNodeType() );
//        System.out.println( n.getNodeName() );
//
//        doc.getDocumentElement().setAttributeNS( "moo", "xmlns", "boo" );
        
//        Document doc = Public2.parse( "<a/>" );
//        XmlOptions options = new XmlOptions();
//        options.setSavePrettyPrint();
//
//        Document doc = Public2.parse( "<a><?moo foo?>\r\n<!--comment--></a>" );;
//
//        doc.getDocumentElement().setAttributeNS( "uri:foo.com", "a:b", "value" );
//        doc.getDocumentElement().setAttributeNS( "uri:foo.com", "xxx:b", "kjkj" );
//
//        Public2.dump( doc );
//
//        System.out.println( Public2.save( doc, options ) );
    }
}


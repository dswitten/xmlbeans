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


package xmlcursor.checkin;

import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlCursor.XmlBookmark;
import org.apache.xmlbeans.XmlObject;
import org.junit.Test;
import xmlcursor.common.BasicCursorTestCase;
import xmlcursor.common.Common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class GetBookmarkTest extends BasicCursorTestCase {
    private Bookmark0 _theBookmark0 = new Bookmark0("value0");
    private Bookmark1 _theBookmark1 = new Bookmark1("value1");
    private Bookmark2 _theBookmark2 = new Bookmark2("value2");


    @Test
    public void testGetBookmarkIndependentKey() throws Exception {
        m_xo = XmlObject.Factory.parse(Common.XML_FOO_TEXT);
        m_xc = m_xo.newCursor();
        m_xc.setBookmark(_theBookmark0);
        m_xc.setBookmark(_theBookmark1);
        m_xc.setBookmark(_theBookmark2);
        Bookmark0 ann0 = (Bookmark0) m_xc.getBookmark(Bookmark0.class);
        assertEquals("value0", ann0.text);
        Bookmark1 ann1 = (Bookmark1) m_xc.getBookmark(Bookmark1.class);
        assertEquals("value1", ann1.text);
        Bookmark2 ann2 = (Bookmark2) m_xc.getBookmark(Bookmark2.class);
        assertEquals("value2", ann2.text);
    }

    @Test
    public void testGetBookmarkNullKey() throws Exception {
        m_xo = XmlObject.Factory.parse(Common.XML_FOO_TEXT);
        m_xc = m_xo.newCursor();
        m_xc.setBookmark(_theBookmark0);
        XmlBookmark xa = m_xc.getBookmark(null);
        assertNull(xa);
    }

    @Test
    public void testGetBookmarkInvalidKey() throws Exception {
        m_xo = XmlObject.Factory.parse(Common.XML_FOO_TEXT);
        m_xc = m_xo.newCursor();
        m_xc.setBookmark(_theBookmark0);
        XmlBookmark xa = m_xc.getBookmark(Bookmark1.class);
        assertNull(xa);
    }

    @Test
    public void testGetBookmarkNotAtCursor() throws Exception {
        m_xo = XmlObject.Factory.parse(Common.XML_FOO_TEXT);
        m_xc = m_xo.newCursor();
        m_xc.setBookmark(_theBookmark0);
        m_xc.toNextToken();
        XmlBookmark xa = m_xc.getBookmark(Bookmark0.class);
        assertNull(xa);
    }

    public class Bookmark0 extends XmlCursor.XmlBookmark {
        public String text;

        public Bookmark0(String text) {
            this.text = text;
        }
    }

    public class Bookmark1 extends XmlCursor.XmlBookmark {
        public String text;

        public Bookmark1(String text) {
            this.text = text;
        }
    }

    public class Bookmark2 extends XmlCursor.XmlBookmark {
        public String text;

        public Bookmark2(String text) {
            this.text = text;
        }
    }

}


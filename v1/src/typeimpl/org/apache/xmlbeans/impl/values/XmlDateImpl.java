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

package org.apache.xmlbeans.impl.values;

import org.apache.xmlbeans.XmlDate;
import org.apache.xmlbeans.SchemaType;


public class XmlDateImpl extends JavaGDateHolderEx implements XmlDate
{
    public XmlDateImpl()
        { super(XmlDate.type, false); }
    public XmlDateImpl(SchemaType type, boolean complex)
        { super(type, complex); }
}

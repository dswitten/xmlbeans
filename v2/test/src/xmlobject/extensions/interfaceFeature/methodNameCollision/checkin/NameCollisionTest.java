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
package xmlobject.extensions.interfaceFeature.methodNameCollision.checkin;

import junit.framework.TestCase;
import interfaceFeature.xbean.methodNameCollision.company.CompanyDocument;
import interfaceFeature.xbean.methodNameCollision.company.CompanyType;
import interfaceFeature.xbean.methodNameCollision.company.DepartmentType;
import interfaceFeature.xbean.methodNameCollision.company.ConsultantType;

import org.apache.xmlbeans.XmlString;

public class NameCollisionTest extends TestCase{

    public NameCollisionTest(String s){
        super(s);
    }

    public void test(){
        CompanyDocument poDoc ;

              poDoc= CompanyDocument.Factory.newInstance();
              CompanyType po=poDoc.addNewCompany();


              int LEN=20;

             StringBuffer sExpected=new StringBuffer();
              sExpected.append("<com:company xmlns:com=" +
                      "\"interfaceFeature/xbean/methodNameCollision/company\">" +
                      "<departments>");
             DepartmentType dept=po.addNewDepartments();
             ConsultantType[] it= new ConsultantType[LEN];
              for (int i=0; i < LEN; i++){
                     it[i]=dept.addNewConsultant();
                     XmlString s= XmlString.Factory.newInstance();
                     it[i].setAge(50);
                    it[i].setName4("BEAN Name"+i);
                      sExpected.append("<consultant name=\"BEAN Name"+i+"\" " +
                              "age=\"50\"/>");
              }

            sExpected.append("</departments></com:company>");

             assertEquals( sExpected.toString(), poDoc.xmlText());
             assertTrue( poDoc.validate() );
             assertEquals("Name0", it[0].getName());
             assertEquals("Name2",it[0].getName2());
             assertEquals("Name3",it[0].getName3());
            assertEquals("BEAN Name0",it[0].getName4());



    }

}

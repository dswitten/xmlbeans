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
* originally based on software copyright (c) 2003 BEA Systems
* Inc., <http://www.bea.com/>. For more information on the Apache Software
* Foundation, please see <http://www.apache.org/>.
*/
package org.apache.xmlbeans.impl.jam;

import org.apache.xmlbeans.impl.jam.internal.JServiceParamsImpl;
import org.apache.xmlbeans.impl.jam.internal.JamPrinter;
import org.apache.xmlbeans.impl.jam.provider.DefaultJProvider;

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

/**
 * This is the normal entry point into the JAM subsystem.  JServiceFactory
 * is a singleton factory which can create a new JServiceParams and
 * JServices.  Here is a code sample that demonstrates how to use
 * JServiceFactory.
 *
 * <pre>
 * JServiceFactory factory = JServiceFactory.getInstance();
 * JServiceParams params = factory.createServiceParams();
 * params.includeSources(new File("c:/myproject/src","mypackage/*.java"));
 * JService service = factory.createService(params);
 * </pre>
 *
 * @author Patrick Calahan <pcal@bea.com>
 */
public class JServiceFactory {

  // ========================================================================
  // Constants

  private static final JServiceFactory INSTANCE = new JServiceFactory();

  // ========================================================================
  // Singleton

  /**
   * Return the factory singleton.
   */
  public static JServiceFactory getInstance() { return INSTANCE; }

  private JServiceFactory() {}

  // ========================================================================
  // Public methods

  /**
   * Create a new JServiceParams instance.  The params can be populated
   * and then given to the createService method to create a new JService.
   */
  public JServiceParams createServiceParams() {
    return new JServiceParamsImpl();
  }

  /**
   * Create a new JService from the given parameters.
   *
   * @throws IOException if an IO error occurred while creating the service
   * @throws IllegalArgumentException if the params is null or not
   * an instance returned by createServiceParams().
   */
  public JService createService(JServiceParams params) throws IOException {
    return DefaultJProvider.getInstance().createService(params);
  }

  // ========================================================================
  // main() method

  public static void main(String[] args) {
    try {
      JServiceParams sp = getInstance().createServiceParams();
      for(int i=0; i<args.length; i++) {
        sp.includeSourceFiles(new File("."),args[i]);
      }
      JService service = getInstance().createService(sp);
      JamPrinter jp = JamPrinter.newInstance();
      PrintWriter out = new PrintWriter(System.out);
      for(JClassIterator i = service.getClasses(); i.hasNext(); ) {
        out.println("-------- ");
        jp.print(i.nextClass(),out);
      }
      out.flush();
    } catch(Exception e){
      e.printStackTrace();
    }
    System.out.flush();
    System.err.flush();

  }
}
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
package org.apache.xmlbeans.test.jam.cases;

/**
 *
 * @author Patrick Calahan &lt;email: pcal-at-bea-dot-com&gt;
 */
public abstract class HeavilyCommented {

  /**
   * A simple comment.
   */
  protected abstract void simpleComment();

  /**
   * A comment which
   * spans
   *
   * several
   *
   *
   * lines.
   */
  protected abstract void multilineComment();



  /**
   * Here is some
   **funky
   comment text
                            but it should still
   **** parse correctly
   */
//  protected abstract void strangeComment();

}
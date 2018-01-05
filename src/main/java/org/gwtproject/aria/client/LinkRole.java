/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.gwtproject.aria.client;
/////////////////////////////////////////////////////////
// This is auto-generated code.  Do not manually edit! //
/////////////////////////////////////////////////////////

import org.gwtproject.aria.client.CommandRole;
import org.gwtproject.aria.client.ExpandedValue;
import org.gwtproject.aria.client.Role;
import org.gwtproject.aria.client.Roles;
import elemental2.dom.HTMLElement;

/**
 * A type that represents the <a href="http://www.w3.org/TR/wai-aria/roles#link">link</a>
 * role in the ARIA specification.
 *
 * @see Role
 * @see Roles
 */
public interface LinkRole extends CommandRole {
  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-expanded">
   * aria-expanded</a> attribute for the {@code element} or "" if no
   * such attribute is present.
   */
  String getAriaExpandedState(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-expanded">
   * aria-expanded</a> attribute from the {@code element}.
   */
  void removeAriaExpandedState(HTMLElement element);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-expanded">
   * aria-expanded</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaExpandedState(HTMLElement element, ExpandedValue value);
}
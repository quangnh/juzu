/*
 * Copyright 2013 eXo Platform SAS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package juzu.impl.plugin.router.metamodel;

import juzu.impl.compiler.ElementHandle;
import juzu.impl.compiler.MessageCode;
import juzu.impl.metamodel.AnnotationState;
import juzu.impl.metamodel.Key;
import juzu.impl.metamodel.MetaModelObject;

import java.util.HashMap;

/** @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a> */
public class RouterMetaModel extends MetaModelObject {

  /** . */
  public static final MessageCode ROUTER_DUPLICATE_ROUTE = new MessageCode("ROUTER_DUPLICATE_ROUTE", "The route %1s is already declared");

  /** . */
  public final static Key<RouterMetaModel> KEY = Key.of(RouterMetaModel.class);

  /** . */
  final HashMap<ElementHandle<?>, AnnotationState> annotations = new HashMap<ElementHandle<?>, AnnotationState>();

  /** . */
  RouteMetaModel root;

  /** . */
  String packageRoute;

  /** . */
  Integer packagePriority;

  public RouteMetaModel getRoot() {
    return root;
  }

  public String getPackageRoute() {
    return packageRoute;
  }

  public Integer getPackagePriority() {
    return packagePriority;
  }
}

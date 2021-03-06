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

package juzu.impl.template.spi;

import juzu.impl.common.Content;
import juzu.impl.common.MethodInvocation;
import juzu.impl.common.Path;
import juzu.impl.common.Resource;
import juzu.impl.common.Timestamped;
import juzu.impl.compiler.ProcessingException;

import java.io.Serializable;
import java.util.Map;

/** @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a> */
public abstract class SimpleProcessContext extends ProcessContext {

  /** . */
  protected final Map<Path.Absolute, TemplateModel<?>> templates;

  public SimpleProcessContext(Map<Path.Absolute, TemplateModel<?>> templates) {
    this.templates = templates;
  }

  @Override
  protected Path.Absolute resolvePath(Path.Relative path) {
    return Path.Absolute.absolute(path.getName(), path.getExt());
  }

  @Override
  public Resource<Timestamped<Content>> resolveResource(Path.Absolute path) {
    return null;
  }

  @Override
  public MethodInvocation resolveMethodInvocation(String typeName, String methodName, Map<String, String> parameterMap) throws ProcessingException {
    return null;
  }
}

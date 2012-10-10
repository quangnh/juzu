/*
 * Copyright (C) 2012 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package juzu.impl.plugin;

import juzu.impl.metadata.Descriptor;
import juzu.impl.common.JSON;

/**
 * Base class for a plugin.
 *
 * @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a>
 */
public abstract class Plugin {

  /** The plugin name. */
  private final String name;

  protected Plugin(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  /**
   * Returns the plugin descriptor or null if the plugin should not be loaded.
   *
   * @param loader the loader
   * @param config the plugin config
   * @return the descriptor
   * @throws Exception any exception
   */
  public Descriptor init(ClassLoader loader, JSON config) throws Exception {
    return null;
  }
}

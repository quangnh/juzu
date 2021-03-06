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

package juzu.impl.bridge.runmode;

import juzu.impl.common.Content;
import juzu.impl.common.RunMode;
import juzu.test.AbstractWebTestCase;
import juzu.test.FileResource;
import juzu.test.JavaFile;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.HttpURLConnection;
import java.net.URL;

/** @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a> */
public abstract class AbstractRunModeLiveTemplateTestCase extends AbstractWebTestCase {

  @Drone
  WebDriver driver;

  protected abstract URL getURL();

  @Test
  public void testRender() throws Exception {
    driver.get(getURL().toString());
    WebElement elt = driver.findElement(By.id("test"));
    assertEquals("ok", elt.getText());
    FileResource<?> index = getCompiler().assertSource("bridge.runmode.live.template.templates.index", "gtmpl");
    index.assertSave(index.assertContent().replace("ok", "OK"));
    driver.get(getURL().toString());
    elt = driver.findElement(By.id("test"));
    assertEquals("OK", elt.getText());
  }
}

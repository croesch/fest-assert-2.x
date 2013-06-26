/*
 * Created on Jun 17, 2013
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2013 the original author or authors.
 */
package org.fest.assertions.api;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * All tests for {@link MapAssert}.
 *
 * @author Yvonne Wang
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
  MapAssert_isEmpty_Test.class,
  MapAssert_isNullOrEmpty_Test.class,
  MapAssert_isNotEmpty_Test.class,
  MapAssert_contains_Test.class,
  MapAssert_containsKey_Test.class,
  MapAssert_containsValue_Test.class,
  MapAssert_containsOnly_Test.class,
  MapAssert_doesNotContain_Test.class,
  MapAssert_doesNotContainKey_Test.class,
  MapAssert_doesNotContainValue_Test.class,
  MapAssert_hasSize_Test.class
})
public class MapAssert_TestSuite {

}
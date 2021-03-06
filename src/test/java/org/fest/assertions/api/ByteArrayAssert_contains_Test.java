/*
 * Created on Dec 17, 2010
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
 * Copyright @2010-2011 the original author or authors.
 */
package org.fest.assertions.api;

import static org.junit.Assert.assertSame;

import org.fest.test.ExpectedException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

/**
 * Tests for <code>{@link ByteArrayAssert#contains(byte...)}</code>.
 *
 * @author Alex Ruiz
 * @author Yvonne Wang
 */
public class ByteArrayAssert_contains_Test {

  @Rule
  public ExpectedException thrown = ExpectedException.none();
  private byte[] actual = { 6, 8, 16, 18 };
  private byte[] values = { 6, 16 };
  private ByteArrayAssert assertions;

  @Before
  public void setUp() {
    assertions = new ByteArrayAssert(actual);
  }

  @Test
  public void should_return_this() {
    ByteArrayAssert returned = assertions.contains(values);
    assertSame(returned, assertions);
  }

  @Test
  public void should_pass_if_actual_contains_expected() {
    assertions.contains(values);
  }

  @Test
  public void should_fail_if_actual_does_not_contain_expected() {
    thrown.expect(AssertionError.class);
    actual = new byte[2];
    assertions = new ByteArrayAssert(actual);
    assertions.contains(values);
  }

  @Test
  public void should_throw_error_if_actual_is_null() {
    thrown.expect(AssertionError.class);
    actual = null;
    assertions = new ByteArrayAssert(actual);
    assertions.contains(values);
  }

  @Test
  public void should_throw_error_if_given_values_is_null() {
    thrown.expect(NullPointerException.class);
    values = null;
    assertions.contains(values);
  }

  @Test
  public void should_throw_error_if_actual_is_empty() {
    thrown.expect(AssertionError.class);
    actual = new byte[0];
    assertions = new ByteArrayAssert(actual);
    assertions.contains(values);
  }
}

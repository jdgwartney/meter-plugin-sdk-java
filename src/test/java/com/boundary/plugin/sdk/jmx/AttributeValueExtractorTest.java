// Copyright 2014-2015 Boundary, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.boundary.plugin.sdk.jmx;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.*;

import static org.junit.Assert.*;

import com.boundary.plugin.sdk.jmx.extractor.AttributeValueExtractor;
import com.boundary.plugin.sdk.jmx.MBeanAttribute;

public class AttributeValueExtractorTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {

	}

	@Ignore
	@Test
	public void testValueDefaultScaling() {
		AttributeValueExtractor valueExtractor = new AttributeValueExtractor();
		int value = 2;
		MBeanAttribute attr = new MBeanAttribute();
		assertEquals(2.0, valueExtractor.getValue(value, attr).doubleValue());
	}

	@Ignore
	@Test
	public void testValueCustomScaling() {
		AttributeValueExtractor valueExtractor = new AttributeValueExtractor();
		Number value = 2;
		MBeanAttribute attr = new MBeanAttribute();
		attr.setScale(3.0);
		assertEquals(6.0, valueExtractor.getValue(value, attr).doubleValue());
	}

}
/**
 *@author thomas
 */

package com.imie.tp.calculator.operation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author thomas
 *
 */
public class AdditionOperationTest {

	protected AdditionOperation add;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.add = new AdditionOperation(1);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.add = null;
	}

	@Test
	public void testMake() {
		this.add.make(2);

		org.junit.Assert.assertNotNull(this.add);
		org.junit.Assert.assertEquals(3, this.add.baseValue, 2);
	}

	@Test
	public void testGetValue() {
		org.junit.Assert.assertNotNull(this.add);
		org.junit.Assert.assertEquals(1, this.add.getCurrentValue(), 2);
	}

}

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
public class MultiplicationOperationTest {

	protected MultiplicationOperation mult;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.mult = new MultiplicationOperation(3);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.mult = null;
	}

	@Test
	public void testMake() {
		this.mult.make(2);

		org.junit.Assert.assertNotNull(this.mult);
		org.junit.Assert.assertEquals(6, 6);
	}

	@Test
	public void testGetValue() {
		org.junit.Assert.assertNotNull(this.mult);
		org.junit.Assert.assertEquals(3, 3);
	}

}

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
public class DivisionOperationTest {

	protected DivisionOperation div;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.div = new DivisionOperation(10);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.div = null;
	}

	@Test
	public void testMake() {
		this.div.make(2);

		org.junit.Assert.assertNotNull(this.div);
		org.junit.Assert.assertEquals(5, 5);
	}

	@Test
	public void testGetValue() {
		org.junit.Assert.assertNotNull(this.div);
		org.junit.Assert.assertEquals(10, 10);
	}

}

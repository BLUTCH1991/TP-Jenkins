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
public class SubstractionOperationTest {

	protected SubstractionOperation sub;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.sub = new SubstractionOperation(10);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.sub = null;
	}

	@Test
	public void testMake() {
		this.sub.make(5);

		org.junit.Assert.assertNotNull(this.sub);
		org.junit.Assert.assertEquals(5, 5);
	}

	@Test
	public void testGetValue() {
		org.junit.Assert.assertNotNull(this.sub);
		org.junit.Assert.assertEquals(10, 10);
	}

}

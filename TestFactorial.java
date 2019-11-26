package com.infoud.assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFactorial {

	private Factorial factorial;

	@Before
	public void beforeClass() {
		System.out.println("Start of Factorial::");
		factorial = new Factorial();

	}

	@Test(expected = Exception.class)
	public void testIfNoIsZero() throws Exception {

		Assert.assertEquals("", factorial.factorial1(0));

	}

	@Test
	public void testIfNoIsPositive() throws Exception {

		Assert.assertEquals(24, factorial.factorial1(4));

	}

	@Test(expected = Exception.class)
	public void testIfNoIsNegative() throws Exception {

		Assert.assertEquals("", factorial.factorial1(-5));

	}

}

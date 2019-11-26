package com.infoud.assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPrime {

	private Prime prime;

	@Before
	public void beforeClass() {
		prime = new Prime();

	}

	@Test(expected = ArithmeticException.class)
	public void testIfNoIsZero() throws Exception {

		Assert.assertEquals("number is not prime", prime.primeCheck(0));

	}

	@Test
	public void testIfNoIsNotPrime() throws Exception {

		Assert.assertEquals("number is not prime", prime.primeCheck(10));

	}

	@Test
	public void testIfNoIsPrime() {

		Assert.assertEquals("number is prime", prime.primeCheck(5));

	}

}

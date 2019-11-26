package com.infoud.assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEvenOdd {
	private EvenOdd evenodd;

	@Before
	public void beforeClass() {
		evenodd = new EvenOdd();

	}

	@Test
	public void testIfNoIsOdd() {

		Assert.assertEquals("odd", evenodd.checkNo(7));

	}

	@Test
	public void testIfNoIsEven() {

		Assert.assertEquals("even", evenodd.checkNo(20));

	}

}

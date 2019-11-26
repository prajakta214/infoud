package com.infoud.assignment;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestReverseSeries {

	private static ReverseSeries reverseSeries;

	@BeforeClass
	public static void before() {
		reverseSeries = new ReverseSeries(0);
	}

	@Test
	public void testReverseSeriesMethod() {
		Assert.assertEquals(102, reverseSeries.reverseSeriesmethod(201));
	}

	@Test(expected = ArithmeticException.class)
	public void testReverseSeriesMethodWithNegative() {
		Assert.assertEquals(-1, reverseSeries.reverseSeriesmethod(-201));
	}

	@Test(expected = ArithmeticException.class)
	public void testReverseSeriesMethodWithZero() {
		Assert.assertEquals(-1, reverseSeries.reverseSeriesmethod(0));
	}

}

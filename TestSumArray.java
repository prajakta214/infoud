package com.infoud.assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSumArray {

	private SumArray sumArray = new SumArray(6);

	@Before
	public void before() {
		int arr[] = { 1, 5, 6, 8, 9 };
		sumArray.setArray(arr);
	}

	@Test
	public void testSumOfElement() {

		Assert.assertEquals(29, sumArray.sum());

	}

}

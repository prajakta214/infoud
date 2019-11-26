package com.infoud.assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMinMax {

	private MinMax minmax = new MinMax(4);

	
	
	@Before
	public void before() {
		int arr[] = { 1, 5, 6, 81, 9, 63 };
		minmax.setArray(arr);
	}

	@Test
	public void testIfMinElement() {

		Assert.assertEquals(1, minmax.min());

	}

	@Test
	public void testIfMaxnElement() {

		Assert.assertEquals(81, minmax.max());

	}

}

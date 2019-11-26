package com.infoud.maths;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdditionTest {

	private static Addition addition;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Start of Addition class::");
		addition = new Addition();
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("End of Addition Class.");
	}

	@Test
	public void testAdditionWith2Integer() {
		Integer i = addition.Operation(5, 2);
		Assert.assertEquals(new Integer(7), i);
	}

	@Test
	public void testAdditionWith2Null() {
		Integer i = addition.Operation(null, null);
		Assert.assertEquals(null, i);
	}

	@Test
	public void testAdditionWithFirstValueAsNull() {
		Integer i = addition.Operation(null, 6);
		Assert.assertEquals(null, i);
	}

	@Test
	public void testAdditionWith2ndValueAsNull() {
		Integer i = addition.Operation(5, null);

		Assert.assertEquals(null, i);
	}

}

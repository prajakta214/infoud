package com.infoud.area;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCircle {

	private static Circle circle;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Start of Circle class::");
		circle = new Circle();
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("End of Circle class::");
	}

	@Test
	public void testCircleArea() {
		double d = 3.142 * 2 * 2;
		Assert.assertEquals(12.568, d);
	}

	@Test
	public void testCircleVolume() {
		double d = 3.142 * 2 * 2 * 2;
		Assert.assertEquals(25.136, d);
	}
}

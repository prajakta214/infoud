package com.infoud.area;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSquare {

	private static Square square;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Start of Square class::");
		square = new Square();
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("End of Square class::");
	}

	public void testSquareArea() {
		double d = 4 * 2;
		Assert.assertEquals(8.0, d);
	}

	@Test
	public void testSquareVolume() {
		double d = 4 * 2 * 3;
		Assert.assertEquals(24.0, d);
	}
}

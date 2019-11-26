package com.infoud.area;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculation {

	public static Calculation calculation, calculation2, calculation3,
			calculation4;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Start of Calculation class.");
		calculation = new Calculation(new Circle());
		calculation2 = new Calculation(new Rectangle());
		calculation3 = new Calculation(new Square());
		calculation4 = new Calculation(new Triangle());
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

	@Test
	public void testRectangleArea() {
		double d = 4 * 2;
		Assert.assertEquals(8.0, d);
	}

	@Test
	public void testRectangleVolume() {
		double d = 4 * 2 * 3;
		Assert.assertEquals(24.0, d);
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

	@Test
	public void testTriangleArea() {
		double d = (4 * 4) / 2;
		Assert.assertEquals(8.0, d);
	}
}

package com.infoud.area;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRectangle {
	
	private static Rectangle rectangle;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Start of Rectangle class.");
		rectangle=new Rectangle();
	}

	@AfterClass
	public static void afterClass(){
		System.out.println("End of Rectangle class.");
	}
	@Test
	public void testRectangleArea() {
		double d = 4*2;
		Assert.assertEquals(8.0, d);
	}

	@Test
	public void testRectangleVolume() {
		double d = 4 * 2 * 3;
		Assert.assertEquals(24.0, d);
	}
	
	
	
}

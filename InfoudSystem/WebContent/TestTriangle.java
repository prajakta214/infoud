package com.infoud.area;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTriangle {
	
	private static Triangle triangle;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Start of Triangle class::");
		triangle = new Triangle();
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("End of Triangle class::");
	}

	@Test
	public void testTriangleArea() {
		double d = (4 * 4)/2;
		Assert.assertEquals(8.0, d);
	}


}

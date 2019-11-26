package com.infoud.testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathsTest {

	private Maths maths;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Start of class.");
	}

	@Before
	public void beforteMethod() {
		maths = new Maths();
		System.out.println("Before start of each method");
	}
	
	@After
	public void afterMethod(){
		System.out.println("After end of each method");
	}

	@Test
	public void testAdd() {

		int c = maths.add(2, 5);
		Assert.assertEquals(7, c);
	}

	@Test
	public void testSubtraction() {

		int c = maths.subratction(3, 2);
		Assert.assertEquals(1, c);
	}

	@Test
	public void testMultiplication() {

		int c = maths.multiplication(4, 5);
		Assert.assertEquals(20, c);
	}

	@Test
	public void testDivision() {

		int c = maths.division(10, 5);
		Assert.assertEquals(2, c);
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("End of class. ");
	}
}

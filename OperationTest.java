package com.infoud.depinjection;

import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class OperationTest {
	
	private static Operation operation, op2, op3, op4;

	@BeforeClass
	public static void beforeClass(){
		System.out.println("Start of Operation class::");
		operation = new Operation(new Addition());
		op2=new Operation(new Subtraction());
		op3=new Operation(new Multiplication());
		op4=new Operation(new Division());
	}

	@AfterClass
	public static void afterClass(){
		System.out.println("End of Operation Class.");
	}
	
	@Test
	public void testAddition(){
		Integer i=operation.Perform(5, 2);
		Assert.assertEquals(new Integer(7), i);
	}
	@Test
	public void testSubtraction(){
		Integer i=op2.Perform(5, 2);
		Assert.assertEquals(new Integer(3), i);
	}
	@Test
	public void testMultiplication(){
		Integer i = op3.Perform(3, 2);
		Assert.assertEquals(new Integer(6), i);

	}
	@Test
	public void testDivision(){
		Integer i = op4.Perform(10, 2);
		Assert.assertEquals(new Integer(5), i);

	}
	
}



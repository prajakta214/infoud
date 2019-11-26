package com.infoud.depinjection;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.infoud.maths.Multiplication;

public class MulTest {

private static Multiplication multiplication;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Start Of Multiplication Class::");
        multiplication=new Multiplication();  
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("End of Multiplication class.");
	}
	
	@Test
	public void testAdditionWith2Integer(){
		Integer i = multiplication.Operation(5, 2);
		Assert.assertEquals(new Integer(10), i);
	}
	@Test
	public void testAdditionWith2Null(){
		Integer i = multiplication.Operation(null, null);
		Assert.assertEquals(null, i);
	}
	@Test
	public void testAdditionWithFirstValueAsNull(){
		Integer i = multiplication.Operation(null, 6);
		Assert.assertEquals(null, i);
	}
	@Test
	public void testAdditionWith2ndValueAsNull(){
		Integer i = multiplication.Operation(5, null);
		Assert.assertEquals(null, i);
	}
}

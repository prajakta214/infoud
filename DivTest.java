package com.infoud.depinjection;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.infoud.maths.Division;

public class DivTest {
private static Division division;
	

	@BeforeClass
	public static void beforeClass(){
		System.out.println("Start of Division class::");
	
		division=new Division();
	}

	@AfterClass
	public static void afterClass(){
		System.out.println("End of Division Class.");
	}
	@Test
	public void testAdditionWith2Integer(){
		Integer i = division.Operation(10, 2);
		Assert.assertEquals(new Integer(5), i);
	}
	@Test
	public void testAdditionWith2Null(){
		Integer i = division.Operation(null, null);
		Assert.assertEquals(null, i);
	}
	@Test
	public void testAdditionWithFirstValueAsNull(){
		Integer i = division.Operation(null, 6);
		Assert.assertEquals(null, i);
	}
	@Test
	public void testAdditionWith2ndValueAsNull(){
		Integer i = division.Operation(5, null);
		Assert.assertEquals(null, i);
	}
	


}

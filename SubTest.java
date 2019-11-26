package com.infoud.depinjection;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.infoud.maths.Subratction;

public class SubTest {
	
	private static Subratction subratction;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Start of Subtraction class::");

		subratction = new Subratction();
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("End of Subtraction class.");
	}

	@Test
	public void testAdditionWith2Integer(){
		Integer i = subratction.Operation(5, 2);
		Assert.assertEquals(new Integer(3), i);
	}
	@Test
	public void testAdditionWith2Null(){
		Integer i = subratction.Operation(null, null);
		Assert.assertEquals(null, i);
	}
	@Test
	public void testAdditionWithFirstValueAsNull(){
		Integer i = subratction.Operation(null, 6);
		Assert.assertEquals(null, i);
	}
	@Test
	public void testAdditionWith2ndValueAsNull(){
		Integer i = subratction.Operation(5, null);
		Assert.assertEquals(null, i);
	}
	

}

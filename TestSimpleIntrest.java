package com.infoud.intrest;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSimpleIntrest {

	private static SimpleIntrest simpleIntrest;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Start of Simple Intrest");
		simpleIntrest =new SimpleIntrest();
	}

	@AfterClass
	public static void afterClass(){
		System.out.println("End of Simple Intrest.");
	}
	@Test
	public void testSimpleIntrest(){
		simpleIntrest=new SimpleIntrest(4, 25000, 2000);
		Assert.assertEquals(2000000.0,simpleIntrest.intrest(), 22);
		
	}
	
}

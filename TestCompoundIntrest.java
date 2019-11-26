package com.infoud.intrest;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCompoundIntrest {
	
	private static CompoundIntrest compoundIntrest;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Start of Compound Intrest");
		compoundIntrest =new CompoundIntrest();
	}

	@AfterClass
	public static void afterClass(){
		System.out.println("End of Compound Intrest.");
	}
	@Test
	public void testCompoundIntrest(){
		compoundIntrest=new CompoundIntrest(25000, 2000, 4);
		//double d=25000*(Math.pow((1+(2000/100)),4));
		//Assert.assertEquals( 4.862025E9, d);
		/*Assert.assertEquals(4.862025E9, compoundIntrest.intrest());
		Assert.assertEquals(4.862025E9, compoundIntrest.intrest());*/
		Assert.assertEquals(4.862025E9, compoundIntrest.intrest(), 22);
	}
}

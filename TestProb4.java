package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb4 {

	private static Prob4 prob4 = new Prob4();

	@Before
	public void before() {
		prob4.getList1().add("Red");
		prob4.getList1().add("Green");
		prob4.getList1().add("Black");
	}

	@Test
	public void testGetElementWithIndexInSize() {
		Assert.assertEquals("Green", prob4.findElement(1));
	}
	
	@Test
	public void testGetElementWithIndexNotInSize(){
		
		Assert.assertEquals("Out of size.", prob4.findElement(4));
		
		
	}

}

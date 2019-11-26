package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb1 {

	private static Prob1 prob1=new Prob1();
	private List<String>list;
	
	@Before
	public void before(){
		list=new ArrayList<String>();
		list.add("Red");
		
	}
	
	@Test
	public void testAddingElement() {
	Assert.assertEquals(list,prob1.addList("Red"));
	
}

}
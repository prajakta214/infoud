package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb3 {

	private Prob3 prob3;
	List<String>list1;
	List<String>list2;
	@Before
	public void before(){
		prob3=new Prob3();
		list1=new ArrayList<String>();
		list1.add("Red");
		list1.add("Green");
		
		list2=new ArrayList<String>();
		list2.add("Black");
		list2.add("Red");
		list2.add("Green");
	}
	@Test
	public void testElementAddingAt0thIndex(){
		Assert.assertEquals(list2, prob3.addElementAt0thIndex(list1, "Black"));
	}

}

package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb14 {

	Prob14 prob14=new Prob14();
	List<String>list1;
	List<String>list2;
	@Before
	public void before(){
		prob14=new Prob14();
		list1=new ArrayList<String>();
		list1.add("Black");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Pink");
		
		list2=new ArrayList<String>();
		list2.add("Green");
		list2.add("Blue");
		list2.add("Black");
		list2.add("Pink");
	}
	@Test
	public void testSwappingElement(){
		Assert.assertEquals(list2, prob14.swapElements(list1));
	}
}

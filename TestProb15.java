package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb15 {

	private Prob15 prob15;
	List<String>list1;
	List<String>list2;
	List<String>list3;
	@Before
	public void before(){
		prob15=new Prob15();
		list1=new ArrayList<String>();
		list1.add("Green");
		list1.add("Blue");
		
		list2=new ArrayList<String>();
		list2.add("Black");
		list2.add("White");
		
		list3=new ArrayList<String>();
		list3.add("Green");
		list3.add("Blue");
		list3.add("Black");
		list3.add("White");
	}
	@Test
	public void testAddingAllElements(){
		Assert.assertEquals(list3, prob15.addAll(list1, list2));
	}
}

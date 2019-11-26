package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb17 {

	private Prob17 prob17;
	List<String>list1;
	List<String>list2;
	@Before
	public void before(){
		prob17=new Prob17();
		list1=new ArrayList<String>();
		list1.add("Red");
		list1.add("green");
		
		list2=new ArrayList<String>();
	}
	@Test
	public void testClearList(){
		Assert.assertEquals(list2, prob17.clearList(list1));
	}
}

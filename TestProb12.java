package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb12 {

	private Prob12 prob12;
	List<String>list1;
	List<String>list2;
	@Before
	public void befor(){
		prob12=new Prob12();
		list1=new ArrayList<String>();
		list1.add("red");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Pink");
		
		list2=new ArrayList<String>();
		list2.add("Blue");
		list2.add("Green");
	}
	@Test
	public void testSubList(){
		Assert.assertEquals(list2, prob12.subList(list1));
	}
	
}

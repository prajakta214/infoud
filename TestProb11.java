package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb11 {

	private Prob11 prob11;
	List<String> list1;
	List<String> list2;

	@Before
	public void before() {
		prob11 = new Prob11();
		list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Black");

		list2 = new ArrayList<String>();
		list2.add("Black");
		list2.add("Green");
		list2.add("Red");

	}
	@Test
	public void testReverseList(){
		Assert.assertEquals(list2, prob11.reverseList(list1));
	}
}

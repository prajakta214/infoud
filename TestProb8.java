package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb8 {

	private Prob8 prob8;
	List<String> list1;
	List<String> list2;

	@Before
	public void before() {
		prob8 = new Prob8();
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
	public void testSortList() {
		Assert.assertEquals(list2, prob8.sortList(list1));
	}

}

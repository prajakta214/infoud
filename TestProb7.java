package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb7 {

	private Prob7 prob7;
	List<String> list1;
	List<String> list2;

	@Before
	public void before() {
		prob7 = new Prob7();
		list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Black");

		list2 = new ArrayList<String>();

		list2.add("Red");
		list2.add("Black");
	}

	@Test
	public void testFindIndexOfElement() {
		Assert.assertEquals(1, prob7.findIndexOfElement(list1, "Green"));
	}

}

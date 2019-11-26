package com.infoud.linkedlist;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb3 {

	private Prob3 prob3;
	List<String> list1;
	List<String> list2;

	@Before
	public void before() {
		prob3 = new Prob3();
		list1 = new LinkedList<String>();
		list1.add("Black");
		list1.add("Red");
		list2 = new LinkedList<String>();
		list2.add("Black");
		list2.add("Red");
		list2.add("Blue");
	}

	@Test
	public void testAddList() {
		Assert.assertEquals(list2, prob3.addElementsAtIndex(list1, 2, "Blue"));
	}
}

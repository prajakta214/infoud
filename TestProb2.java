package com.infoud.linkedlist;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb2 {

	private Prob2 prob2;
	List<String> list1;

	@Before
	public void before() {
		prob2 = new Prob2();
		list1 = new LinkedList<String>();

		list1.add("Red");
		list1.add("Blue");
		list1.add("Black");

	}

	@Test
	public void testIterateList() {
		Assert.assertEquals(list1, prob2.iterateLikedList(list1));
	}

}

package com.infoud.linkedlist;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb1 {

	private Prob1 prob1;
	List<String> list1;

	@Before
	public void before() {
		prob1 = new Prob1();
		list1 = new LinkedList<String>();

		list1.add("Red");

	}

	@Test
	public void testAddList() {
		Assert.assertEquals(list1, prob1.addElements(list1, "Red"));
	}

}

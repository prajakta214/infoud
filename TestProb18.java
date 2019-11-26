package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb18 {

	private Prob18 prob18;
	List<String> list1;
	List<String> list2;

	@Before
	public void before() {
		prob18 = new Prob18();
	}

	@Test
	public void testIfListIsNotEmpty() {
		list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Black");
		Assert.assertFalse(prob18.checkListIsEmpty(list1));
	}

	@Test
	public void testIfListIsEmpty() {
		list2 = new ArrayList<String>();
		Assert.assertTrue(prob18.checkListIsEmpty(list2));
	}
}

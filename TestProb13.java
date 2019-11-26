package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb13 {

	private Prob13 prob13;
	List<String> list1;
	List<String> list2;

	@Before
	public void before() {
		prob13 = new Prob13();

	}

	@Test
	public void testListUnEquality() {
		list1 = new ArrayList<String>();
		list1.add("Green");
		list1.add("Yellow");
		list1.add("Pink");

		list2 = new ArrayList<String>();
		list2.add("Yellow");
		list2.add("Black");
		list2.add("White");
		Assert.assertFalse(prob13.equalList(list1, list2));

	}

	@Test
	public void testListEquality() {
		list1 = new ArrayList<String>();
		list1.add("Green");
		list1.add("Yellow");
		list1.add("Pink");

		list2 = new ArrayList<String>();
		list2.add("Green");
		list2.add("Yellow");
		list2.add("Pink");
		Assert.assertTrue(prob13.equalList(list1, list2));

	}
}

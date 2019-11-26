package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb6 {

	private Prob6 prob6;
	List<String> list1;
	List<String> list2;

	@Before
	public void before() {
		prob6 = new Prob6();
		list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Black");

		list2 = new ArrayList<String>();

		list2.add("Red");
		list2.add("Black");
	}

	@Test
	public void testRemovingElementFromSpecifiedIndex() {
		Assert.assertEquals(list2, prob6.removeElement(list1, 1));
	}

}

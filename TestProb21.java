package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb21 {

	private Prob21 prob21;
	List<String> list1;
	List<String> list2;

	@Before
	public void before() {
		prob21 = new Prob21();
		list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Green");

		list2 = new ArrayList<String>();
		list2.add("Red");
		list2.add("Black");

	}

	@Test
	public void testSetElementInList() {
		Assert.assertEquals(list2, prob21.setElement(list1, 1, "Black"));
	}
}

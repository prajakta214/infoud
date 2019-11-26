package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb9 {

	private Prob9 prob9 = new Prob9();
	List<String> list1;
	List<String> list2;
	List<String> list3;

	@Before
	public void before() {
		prob9 = new Prob9();
		list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Black");

		list2 = new ArrayList<String>();
		list2.add("Pink");
		list2.add("Blue");

		list3 = new ArrayList<String>();
		list3.add("Red");
		list3.add("Black");
	}

	@Test
	public void testCopyList() {
		Assert.assertEquals(list3, prob9.copyElements(list2, list1));
	}
}

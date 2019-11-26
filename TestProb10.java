package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb10 {

	private Prob10 prob10;
	List<String> list1;
	List<String> list2;

	@Before
	public void before() {

		prob10 = new Prob10();
		list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Yellow");

		list2 = new ArrayList<String>();
		list2.add("Red");
		list2.add("Green");
		list2.add("Yellow");
	}

	@Test
	public void testShuffleElement() {
		Assert.assertNotSame(list2, prob10.shuffleList(list1));
	}

}

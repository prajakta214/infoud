package com.infoud.hashsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb8 {

	private Prob8 prob8;
	Set<String> set1;
	List<String> list1;

	@Before
	public void before() {
		prob8 = new Prob8();
		set1 = new HashSet<String>();
		list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Yellow");
		list1.add("Red");

		set1.add("Red");
		set1.add("Green");
		set1.add("Yellow");
	}

	@Test
	public void testListIntoSet() {
		Assert.assertEquals(set1, prob8.listIntoSet(list1));
	}

}

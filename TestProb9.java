package com.infoud.hashsets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb9 {

	private Prob9 prob9;
	Set<String> set1;
	Set<String> set2;

	@Before
	public void before() {
		prob9 = new Prob9();
		set1 = new HashSet<String>();
		set2 = new TreeSet<String>();
		set1.add("Pink");
		set1.add("Yellow");
		set1.add("Green");
		set1.add("Black");

		set2.add("Black");
		set2.add("Green");
		set2.add("Pink");
		set2.add("Yellow");
	}

	@Test
	public void testSortSet() {

		Assert.assertEquals(set2, prob9.sortHashSet(set1));
	}

}

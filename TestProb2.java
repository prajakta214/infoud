package com.infoud.hashsets;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb2 {

	private Prob2 prob2;
	Set<String> set1;

	@Before
	public void before() {
		prob2 = new Prob2();
		set1 = new HashSet<String>();

		set1.add("Red");
		set1.add("Green");
		set1.add("Black");
	}

	@Test
	public void testIterateSet() {
		Assert.assertEquals(set1, prob2.iterarteSet(set1));
	}

}

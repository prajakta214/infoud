package com.infoud.hashsets;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb1 {

	private Prob1 prob1;
	Set<String> set1;

	@Before
	public void before() {
		prob1 = new Prob1();
		set1 = new HashSet<String>();

		set1.add("Red");

	}

	@Test
	public void testAddInSet() {
		Assert.assertEquals(set1, prob1.addInSet(set1, "Red"));
	}
}

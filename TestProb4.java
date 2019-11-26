package com.infoud.hashsets;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb4 {

	private Prob4 prob4;
	Set<String> set1;
	Set<String> set2;

	@Before
	public void before() {
		prob4 = new Prob4();
		set1 = new HashSet<String>();
		set2 = new HashSet<String>();
		set1.add("Red");
		set1.add("Green");
		set1.add("Black");
	}

	@Test
	public void testSetSize() {
		Assert.assertEquals(set2, prob4.Clearset(set1));
	}
}

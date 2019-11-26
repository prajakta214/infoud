package com.infoud.hashsets;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb3 {

	private Prob3 prob3;
	Set<String> set1;

	@Before
	public void before() {
		prob3 = new Prob3();
		set1 = new HashSet<String>();

		set1.add("Red");
		set1.add("Green");
		set1.add("Black");
	}

	@Test
	public void testSetSize() {
		Assert.assertEquals(new Integer(3), prob3.setSize(set1));
	}
}

package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb6 {

	private Prob6 prob6;
	Map<Integer, Integer> map1;

	@Before
	public void before() {
		prob6 = new Prob6();
		map1 = new HashMap<Integer, Integer>();

		map1.put(1, 100);
		map1.put(2, 200);
		map1.put(3, 300);

	}

	@Test
	public void testIfMapContainsKey() {
		Assert.assertTrue(prob6.containsKey(map1, 2));
	}

	@Test
	public void testIfMapDoesntContainsKey() {
		Assert.assertFalse(prob6.containsKey(map1, 4));
	}

}

package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb7 {

	private Prob7 prob7;
	Map<Integer, Integer> map1;

	@Before
	public void before() {
		prob7 = new Prob7();
		map1 = new HashMap<Integer, Integer>();

		map1.put(1, 100);
		map1.put(2, 200);
		map1.put(3, 300);

	}

	@Test
	public void testIfMapContainsValue() {
		Assert.assertTrue(prob7.containsValue(map1, 200));
	}

	@Test
	public void testIfMapDoesntContainsValue() {
		Assert.assertFalse(prob7.containsValue(map1, 500));
	}

}

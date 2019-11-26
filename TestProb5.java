package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb5 {

	private Prob5 prob5;
	Map<Integer, Integer> map1;
	Map<Integer, Integer> map2;

	@Before
	public void before() {
		prob5 = new Prob5();
		map1 = new HashMap<Integer, Integer>();
		map2 = new HashMap<Integer, Integer>();

		map1.put(1, 100);
		map1.put(2, 200);
		map1.put(3, 300);

	}

	@Test
	public void testIfMapIsEmpty() {
		Assert.assertTrue(prob5.checkMapIsEmpty(map2));
	}

	@Test
	public void testIfMapIsNotEmpty() {
		Assert.assertFalse(prob5.checkMapIsEmpty(map1));
	}

}

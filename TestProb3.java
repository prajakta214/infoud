package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb3 {

	private Prob3 prob3;
	Map<Integer, Integer> map1;
	Map<Integer, Integer> map2;

	@Before
	public void before() {
		prob3 = new Prob3();
		map1 = new HashMap<Integer, Integer>();
		map2 = new HashMap<Integer, Integer>();

		map1.put(1, 100);
		map1.put(2, 200);
		map1.put(3, 300);

		map2.put(1, 100);
		map2.put(2, 200);
		map2.put(3, 300);

	}

	@Test
	public void testPutAllElement() {
		Assert.assertEquals(map2, prob3.putAllElements(map1, map2));
	}
}

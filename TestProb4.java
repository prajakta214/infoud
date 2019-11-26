package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb4 {

	private Prob4 prob4;
	Map<Integer, Integer> map1;
	Map<Integer, Integer> map2;

	@Before
	public void before() {
		prob4 = new Prob4();
		map1 = new HashMap<Integer, Integer>();
		map2 = new HashMap<Integer, Integer>();

		map1.put(1, 100);
		map1.put(2, 200);
		map1.put(3, 300);

	}

	@Test
	public void testClearAllElement() {
		Assert.assertEquals(map2, prob4.clearMap(map1));
	}

}

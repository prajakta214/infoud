package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb2 {

	private Prob2 prob2;
	Map<Integer, Integer> map1;

	@Before
	public void before() {
		prob2 = new Prob2();
		map1 = new HashMap<Integer, Integer>();

		map1.put(1, 12);
		map1.put(2, 21);
		map1.put(3, 45);
	}

	@Test
	public void testMapSize() {
		Assert.assertEquals(new Integer(3), prob2.checkMapSize(map1));
	}
}

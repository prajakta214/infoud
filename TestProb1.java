package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb1 {

	private Prob1 prob1;
	Map<Integer, String> map1;

	@Before
	public void before() {
		prob1 = new Prob1();
		map1 = new HashMap<Integer, String>();
		map1.put(1, "Red");
	}

	@Test
	public void testAddElemntsInHashMap() {
		Assert.assertEquals(map1, prob1.addElements(1, "Red"));
	}
}

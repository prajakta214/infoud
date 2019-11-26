package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb10 {

	private Prob10 prob10;
	Map<Integer, String> map1;

	@Before
	public void before() {
		prob10 = new Prob10();
		map1 = new HashMap<Integer, String>();
		map1.put(1, "101");
	}

	@Test
	public void testGettingValues() {
		Assert.assertEquals(new String("101"), prob10.getMapValues(map1));
	}
}

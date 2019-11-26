package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb9 {

	private Prob9 prob9;
	Map<Integer, Integer> map1;

	@Before
	public void before() {
		prob9 = new Prob9();
		map1 = new HashMap<Integer, Integer>();
		map1.put(1, 111);
		map1.put(2, 222);
		map1.put(3, 333);
	}

	@Test
	public void testGetValueOfSpecifiedIndex() {
		Assert.assertEquals(new Integer(111), prob9.getValue(map1, 1));
	}

}

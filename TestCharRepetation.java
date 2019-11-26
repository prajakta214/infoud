package com.infoud.assignment;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCharRepetation {

	private static CharRepetation charRepetation;
	private Map<Character, Integer> map = new HashMap<>();

	@BeforeClass
	public static void before() {
		charRepetation = new CharRepetation();
	}

	@Test
	public void testFindCharacter() {
		map.put('m', new Integer(2));
		map.put('a', new Integer(2));
		map.put('d', new Integer(1));

		Assert.assertEquals(map, charRepetation.findCharacter("madam"));
	}

}

package com.infoud.hashsets;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProb5 {

	private Prob5 prob5;
	Set<String> set1;
	Set<String> set2;

	@Before
	public void before() {
		prob5 = new Prob5();
		set1 = new HashSet<String>();
		set2 = new HashSet<String>();
		set1.add("Red");
		set1.add("Green");
		set1.add("Black");
	}

	@Test
	public void testIfSetIsEmpty() {
		Assert.assertTrue(prob5.checkSetIsEmpty(set2));
	}
	
	@Test
	public void testIfSetIsNotEmpty() {
		Assert.assertFalse(prob5.checkSetIsEmpty(set1));
	}
}

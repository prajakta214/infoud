package com.infoud.assignment_1.programming;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProgramming {

	private Programming programming;
	private Programming programming2;

	@Before
	public void before() {
		programming = new Programming();
		programming2 = new Programming("Java");
	}

	@Test
	public void testProgLangWithOutPassingLang() {
		Assert.assertEquals(new String("I Love Programming Lang."),
				programming.print());
	}

	@Test
	public void testProgLangWithPassingLang() {
		Assert.assertEquals(new String("I Love Java"), programming2.print());
	}
}

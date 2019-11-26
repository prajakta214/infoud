package com.infoud.assignment;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSeriesPalindrome {

	private static SeriesPalindrome seriesPalindrome;

	@BeforeClass
	public static void before() {
		seriesPalindrome = new SeriesPalindrome();
	}

	@Test
	public void testSerieIsPalindrome() {
		Assert.assertEquals(121 + " is palindrome",
				seriesPalindrome.reverseSeriesmethod(121));
	}

	@Test
	public void testSeriesIsNotPalindrome() {
		Assert.assertEquals(-205 + "is not palindrome",
				seriesPalindrome.reverseSeriesmethod(-205));
	}

	@Test(expected = ArithmeticException.class)
	public void testIfSeriesIsZero() {
		Assert.assertEquals("no is zero",
				seriesPalindrome.reverseSeriesmethod(0));
	}

}

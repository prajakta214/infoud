package com.infoud.assignment;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBinarySearch {

	private static BinarySearch binarySearch;
	private static int array[] = { 12, 15, 85, 46, 13 };

	@BeforeClass
	public static void before() {
		binarySearch = new BinarySearch();

	}

	@Test
	public void TestSearchElement() {
		Assert.assertEquals("no 12 is present",
				binarySearch.search(array, 0, 4, 12));
	}

	@Test
	public void TestSearchElementNotFound() {
		Assert.assertEquals("no is not present",
				binarySearch.search(array, 0, 4, 48));
	}

}

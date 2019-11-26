package com.infoud.sorting;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBubbleSort {

	private BubbleSort bubbleSort;
	int[] arr = { 12, 54, 4 };
	int[] arr1 = { 4, 12, 54 };

	@Before
	public void beforeClass() {
		System.out.println("Start of bubble sort.");
		bubbleSort = new BubbleSort();

	}

	@Test
	public void testBubbleSort() {

		Assert.assertArrayEquals(arr1, bubbleSort.bubbleSortmethod(arr));
	}
}

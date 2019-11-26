package com.infoud.sorting;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSelectionSort {

	private SelectionSort selectionSort;
	int[] arr = { 12, 54, 4 };
	int[] arr1 = { 4, 12, 54 };

	@Before
	public void beforeClass() {
		System.out.println("Start of selection sort.");
		selectionSort = new SelectionSort();

	}

	@Test
	public void testSelectionSort() {

		Assert.assertArrayEquals(arr1, selectionSort.selection(arr));
	}
}

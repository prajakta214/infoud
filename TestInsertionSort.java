package com.infoud.sorting;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestInsertionSort {

	private InsertionSort insertionSort;
	int[] arr = { 12, 54, 4 };
	int[] arr1 = { 4, 12, 54 };

	@Before
	public void beforeClass() {
		System.out.println("Start of insertion sort.");
		insertionSort = new InsertionSort();

	}

	@Test
	public void testBubbleSort() {

		Assert.assertArrayEquals(arr1, insertionSort.insertionSort(arr));
	}

}

package com.infoud.assignment;

import java.util.Scanner;

public class BinarySearch {

	private int binarySearching(int array[], int start_index, int last_index,
			int element) {
		int mid = (start_index + last_index) / 2;
		while (start_index <= last_index) {

			if (array[mid] == element) {
				// System.out.println("Element is present at mid" + mid);
				return mid;
			} else if (array[mid] < element) {
				// start_index=mid+1;
				return binarySearching(array, mid + 1, last_index, element);
			} else if (array[mid] > element) {
				// last_index=mid-1;
				return binarySearching(array, start_index, mid - 1, element);

			}

		}

		return -1;
		// System.out.println("element is not found");

	}

	public String search(int array[], int start_index, int last_index,
			int element) {
		int result = binarySearching(array, 0, array.length - 1, element);
		if (result == -1) {
			System.out.println("element is not present");
			return "no is not present";
		} else {
			System.out.println("element is present at " + result);
			return "no "+element+" is present";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:\n");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("Enter elements of array:\t");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter element to search:\n");
		int number = sc.nextInt();
		sc.close();
		BinarySearch binarySearch = new BinarySearch();

		System.out.println(binarySearch.search(array, 0, array.length - 1,
				number));

	}
}
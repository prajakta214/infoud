package com.infoud.sorting;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		SelectionSort selectionSort = new SelectionSort();
		BubbleSort bubbleSort = new BubbleSort();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:\n");
		int size = sc.nextInt();
		int array1[] = new int[size];
		System.out.println("Enter elements of array:\t");
		for (int i = 0; i < size; i++) {
			array1[i] = sc.nextInt();
		}
		selectionSort.selection(array1);
		selectionSort.printArray(array1);

		bubbleSort.bubbleSortmethod(array1);
        bubbleSort.print(array1);
        
        insertionSort.insertionSort(array1);
        insertionSort.print(array1);
	}

}

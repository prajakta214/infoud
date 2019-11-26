package com.infoud.assignment;

import java.util.Scanner;

public class MinMax {
	private int array[];

	public MinMax(int size) {
		array = new int[size];
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public void setValue(int index, int value) {
		array[index] = value;
	}

	public int min() {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}

		}
		return min;
	}

	public int max() {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}

		}
		return max;
	}

	public void printarray() {
		for (int i : array) {
			System.out.print("\t"+i);
		}
		System.out.println();
	}

	public static void main(String arg[]) {
		// int array1[]= {93,52,12,36,45,12,11,20};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:\n");
		int size = sc.nextInt();

		MinMax minmax = new MinMax(size);
		System.out.println("Enter elements of array:\t");
		for (int i = 0; i < size; i++) {
			minmax.setValue(i, sc.nextInt());
		}
		minmax.printarray();
		System.out.println(minmax.min());
		System.out.println(minmax.max());
		sc.close();

	}

}

package com.infoud.assignment;

import java.util.Scanner;

public class SumArray {

	public void setArray(int[] array) {
		this.array = array;
	}
	private int[] array;
	
	public SumArray(int size) {
		array=new int[size];
	}
	public void setValue(int index, int value) {
		array[index] = value;
	}
	public int sum() {
		int sum = 0;
		for(int i:array) {
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:\n");
		int size=sc.nextInt();
		SumArray sumArray=new SumArray(size);
		System.out.println("Enter elements of array:\t");
		for(int i=0;i<size;i++)
		{
			sumArray.setValue(i,sc.nextInt());
		}
		
		System.out.println("sum of array:"+sumArray.sum());
		sc.close();
	}

}

package com.infoud.sorting;

import java.util.Scanner;

public class BubbleSort {
	public int[] bubbleSortmethod(int array[]) {
		System.out.println("\nBubble Sorting: ");

		int temp;
		for(int j=1;j<array.length;j++)
		   {
			//System.out.println("\n Iteration: " + j);
		      for(int i=0;i<array.length-1;i++) {
		    	  //System.out.print("Comparing:");
			  if(array[i]>array[i+1]) {
		    	  //System.out.print("Comparing: \n array[" +i+ "]  array[" + (i+1) + "]\n" );

				temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;	
			}
		    }
		   }
		return array;
	}
	public void print(int array[]) {
		for(int i=0;i<=array.length-1;i++) {
			System.out.print("\t"+array[i]);
		}
	}
	
	
	
}

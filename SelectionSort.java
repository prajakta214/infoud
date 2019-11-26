package com.infoud.sorting;

public class SelectionSort {
	
	public int[] selection(int arr[]){
		System.out.println("Selection Sorting: ");

		for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;  
                }  
            }  
            int smallerNo = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNo;  
        }
		return arr;  
	}

	public void printArray(int arr[]){
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print("\t"+arr[i]);
		}	}

}

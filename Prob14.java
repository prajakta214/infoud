package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prob14 {

	public List<String>swapElements(List<String>list){
		Collections.swap(list, 0, 2);
		return list;

	}
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Black");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Pink");
		
		System.out.println("Before Swapping: ");
		for(String s: list1){
			System.out.println(s);
		}
		
		System.out.println("After Swapping: ");
		Prob14 prob14= new Prob14();
		System.out.println(prob14.swapElements(list1));
		
		
	}

}

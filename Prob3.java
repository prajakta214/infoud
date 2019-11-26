package com.infoud.linkedlist;

import java.util.LinkedList;
import java.util.List;

// ---------------------------insert the specified element at the specified position---------------------------------------------//
public class Prob3 {

	public List<String> addElementsAtIndex(List<String> list, int i, String s) {
		list.add(i, s);
		return list;
	}

	public static void main(String[] args) {
		List<String> list1 = new LinkedList<String>();
		list1.add("Red");
		list1.add("Purple");
		list1.add("Green");
		list1.add("Blue");
		System.out.println(list1);

		System.out.println("Add 'Yellow' at 2nd position:");
		Prob3 prob3 = new Prob3();
		prob3.addElementsAtIndex(list1, 2, "Yellow");
		System.out.println(list1);

	}

}

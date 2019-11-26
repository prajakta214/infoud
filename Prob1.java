package com.infoud.linkedlist;

import java.util.LinkedList;
import java.util.List;

//------------------   append the specified element to the end of a linked list -----------------------------------------//

public class Prob1 {

	public List<String> addElements(List<String> list, String s) {
		list.add(s);
		return list;
	}

	public static void main(String[] args) {

		List<String> list1 = new LinkedList<String>();
		Prob1 prob1 = new Prob1();
		prob1.addElements(list1, "Red");
		prob1.addElements(list1, "Yellow");

		prob1.addElements(list1, "Blue");

		System.out.println("list elements: ");
		for (String s : list1) {
			System.out.println(s);
		}

	}

}

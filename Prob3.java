package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Prob3 {

	public List<String> addElementAt0thIndex(List<String> list, String s) {
		list.add(0, s);
		return list;

	}

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();

		list1.add("Red");
		list1.add("Black");
		list1.add("Green");
		list1.add("Yellow");

		System.out.println("elements of arrayList: ");
		for (String s : list1) {
			System.out.println(s);
		}

		Prob3 prob3 = new Prob3();
		System.out
				.println("elements of arrayList after adding element at 1st position: "
						+ prob3.addElementAt0thIndex(list1, "Black"));
		

	}
}

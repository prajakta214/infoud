package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Prob7 {

	public int findIndexOfElement(List<String> list, String s) {
		return list.indexOf(s);
	}

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("Black");
		list1.add("Blue");
		list1.add("Purple");
		System.out.println("List of Elements:");
		for (String s : list1) {
			System.out.println(s);
		}

		Prob7 prob7 = new Prob7();
		System.out.println("Index of Purple: "
				+ prob7.findIndexOfElement(list1, "Purple"));
	}

}

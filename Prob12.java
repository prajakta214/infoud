package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Prob12 {

	public List<String> subList(List<String> list) {
		List<String> list2 = new ArrayList<String>();
		list2.addAll(list.subList(1, 3));
		return list2;
	}

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Black");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Pink");

		Prob12 prob12 = new Prob12();
		System.out.println(prob12.subList(list1));

		/*
		 * System.out.println("Original List: "); for(String s: list1){
		 * System.out.println(s); }
		 * 
		 * List<String> list2 =new ArrayList<String>();
		 * list2.addAll(list1.subList(1, 3)); System.out.println("Sub list: ");
		 * for (String string : list2) { System.out.println(string); }
		 */
	}

}

package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prob11 {
	List<String> list1 = new ArrayList<String>();

	public List<String> reverseList(List<String> list) {

		Collections.reverse(list);
		return list;

	}

	public static void main(String[] args) {
		Prob11 prob11 = new Prob11();
		prob11.list1.add("Black");
		prob11.list1.add("Blue");
		prob11.list1.add("Green");
		prob11.list1.add("Pink");
		
		System.out.println(prob11.reverseList(prob11.list1));

		/*System.out.println("Before Reversing: ");
		for (String s : list1) {
			System.out.println(s);
		}

		System.out.println("After Reversing : ");
		for (String s : list1) {
			System.out.println(s);
		}*/
	}

}

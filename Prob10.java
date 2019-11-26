package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prob10 {

	List<String> list1 = new ArrayList<String>();

	public List<String> shuffleList(List<String> list) {

		Collections.shuffle(list);

		return list;

	}

	public static void main(String[] args) {
		Prob10 prob10 = new Prob10();
		prob10.list1.add("Red");
		prob10.list1.add("Green");
		prob10.list1.add("Black");
		prob10.list1.add("Blue");
		System.out.println(	prob10.shuffleList(prob10.list1));

		/*System.out.println("Before Shuffle :");
		for (String s : list1) {
			System.out.println(s);
		}
		Collections.shuffle(list1);
		System.out.println("After Shuffle :");
		for (String s : list1) {
			System.out.println(s);
		}*/

	}

}

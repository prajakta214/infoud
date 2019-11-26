package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prob8 {

	public List<String> sortList(List<String> list) {
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("Yellow");
		list1.add("Green");
		list1.add("Bluee");
		list1.add("Purple");
		Prob8 prob8 = new Prob8();
		System.out.println("Sorted List:" + prob8.sortList(list1));

	}

}

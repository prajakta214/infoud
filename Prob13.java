package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Prob13 {

	public boolean equalList(List<String>list1,List<String>list2){
		return list1.equals(list2);
		
	}
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("Black");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Pink");
		System.out.println(list1);
		List<String> list2 = new ArrayList<String>();
		list2.add("Black");
		list2.add("Blue");
		list2.add("Green");
		list2.add("Pink");
		//list2.add("Pink");
		System.out.println(list2);
		
		Prob13 prob13=new Prob13();
		System.out.println("List1 is equal to list2 ? : "+prob13.equalList(list1, list2));
		
		
	}

}

package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Prob18 {

	public boolean checkListIsEmpty(List<String>list){
		return list.isEmpty();
		
	}
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Black");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Pink");
		Prob18 prob18=new Prob18();
		System.out.println("List is empty or not? :" + prob18.checkListIsEmpty(list1));
	}

}

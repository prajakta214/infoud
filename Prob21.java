package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Prob21 {

	public List<String>setElement(List<String>list, int i, String s){
		list.set(i, s);
		return list;
	}
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Black");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Pink");
		System.out.println(list1);
		
		//list1.set(2, "White");
		Prob21 prob21=new Prob21();
		System.out.println("After Replacing: "+prob21.setElement(list1, 2, "Red"));
	}

}

package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Prob17 {

	public List<String>clearList(List<String>list){
		list.clear();
		return list;
	}
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Black");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Pink");
		
		System.out.println("List: "+list1);
		Prob17 prob17=new Prob17();
		prob17.clearList(list1);
		
		System.out.println("Empty list: "+ list1);
	}

}

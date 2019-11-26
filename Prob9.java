package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prob9 {
	
	public List<String>copyElements(List<String>list, List<String>list2){
		Collections.copy(list, list2);
		return list;
	}
	
	public static void main(String args[]){
		
		List<String>list1=new ArrayList<String>();
		list1.add("Red");
		list1.add("Black");
		
		List<String>list2=new ArrayList<String>();
		list2.add("Blue");
		list2.add("Green");
		
		Prob9 prob9=new Prob9();
		System.out.println(prob9.copyElements(list2, list1));
		
	}
	
	
	
	
	
	
}

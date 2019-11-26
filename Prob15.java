package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Prob15 {

	public List<String>addAll(List<String>list,List<String>list2){
		List<String>list3=new ArrayList<String>();
		list3.addAll(list);
        list3.addAll(list2);
		return list3;
	}
	
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Black");
		list1.add("Blue");
		list1.add("Green");
		list1.add("Pink");
		
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Purple");
		list2.add("Yellow");
		list2.add("White");
		list2.add("Brown");
		
		Prob15 prob15=new Prob15();
		System.out.println(prob15.addAll( list1, list2));
				
		
		/*List<String> list3 = new ArrayList<String>();
         list3.addAll(list1);
         list3.addAll(list2);
         
         for(String s: list3){
        	 System.out.println(s);
         }*/
		
	}

}

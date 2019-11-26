package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Prob6 {

	public List<String>removeElement(List<String>list, int i){
		list.remove(i);
		return list;
	}
	
	
	public static void main(String[] args) {
		List<String>list1= new ArrayList<String>();
		
		list1.add("Green");
		list1.add("Yellow");
		list1.add("Black");
		
		System.out.println("List of elements: ");
		for(String s: list1){
			System.out.println(s);
		}
		Prob6 prob6=new Prob6();
		
		System.out.println("Remove element at 1: "+prob6.removeElement(list1, 2));
	}

}

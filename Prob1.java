package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Prob1 {

	List<String>list1 = new ArrayList<String>();

	public List<String>addList(String s){
		/*list1.add("Green");
		list1.add("Purple");
		list1.add("Black");*/
		list1.add( s);
		return list1;
	}

	
	public static void main(String[] args) {

		Prob1 prob1=new Prob1();
		System.out.println(prob1.addList("Red"));
		
		/*System.out.println("Elements of array List: ");
		for(String s: list1){
			System.out.println(s);*/
		

		
	}

}

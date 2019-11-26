package com.infoud.hashsets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Prob8 {

	public Set<String>listIntoSet(List<String>list){
		Set<String> set1 = new HashSet<String>(list);
		System.out.println("Set Elements: ");
		for(String a: set1){
			System.out.println(a);
		}
		return set1;

	}
	public static void main(String[] args) {

		List<String>list1 = new ArrayList<String>();
		list1.add("Red");
		list1.add("Green");
		list1.add("Yellow");
		list1.add("Red");
		
		System.out.println("List Elements: ");
		for(String s: list1){
			System.out.println(s);
			
		}
		System.out.println();
		Prob8 prob8=new Prob8();

		prob8.listIntoSet(list1);
	}

}

package com.infoud.hashsets;

import java.util.HashSet;
import java.util.Set;

public class Prob6 {

	
	public static void main(String[] args) {
		Set<String> set1=new HashSet<String>();
		set1.add("Pink");
		set1.add("Green");
		set1.add("Black");
		set1.add("Yellow");
		
		System.out.println("Set Elements: ");
		for(String s: set1){
			System.out.println(s);
		}
		
		Object [] arr = set1.toArray();
		System.out.println("Hash set to array: ");
		for(Object o:arr){
			System.out.print("\t"+o);
		}
	}

}

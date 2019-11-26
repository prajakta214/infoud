package com.infoud.hashsets;

import java.util.HashSet;
import java.util.Set;

public class Prob7 {

	public Set<String>removeAll(Set<String>set){
		set.removeAll(set);
		return set;
	}
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
		Prob7 prob7=new Prob7();
		System.out.println("Removing all elements: " +prob7.removeAll(set1));
	}

}

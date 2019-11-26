package com.infoud.hashsets;

import java.util.HashSet;
import java.util.Set;

public class Prob4 {
	public Set<String> Clearset(Set<String> set) {
		set.clear();
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
		System.out.println();
		Prob4 prob4=new Prob4();
		System.out.println("Empty Set: "+prob4.Clearset(set1));
		
	}

}

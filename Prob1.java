package com.infoud.hashsets;

import java.util.HashSet;
import java.util.Set;

public class Prob1 {

	public Set<String>addInSet(Set<String>set,String s){
		set.add(s);
		return set;
		
	}
	public static void main(String[] args) {

		Set<String> set1= new HashSet<String>();
		Prob1 prob1=new Prob1();
		prob1.addInSet(set1, "Red");
		prob1.addInSet(set1, "Black");
		
		System.out.println("Set Elements: ");
		for(String s: set1){
			System.out.println(s);
		}
		
	}

}

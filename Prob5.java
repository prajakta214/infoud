package com.infoud.hashsets;

import java.util.HashSet;
import java.util.Set;

public class Prob5 {

	public boolean checkSetIsEmpty(Set<String> set) {
		return set.isEmpty();
	}
	public static void main(String[] args) {

		Set<String> set1=new HashSet<String>();
		set1.add("Pink");
		set1.add("Green");
		set1.add("Black");
		set1.add("Yellow");
		Prob5 prob5=new Prob5();
		System.out.println("Set is empty or not??  " + prob5.checkSetIsEmpty(set1));
		
		
	}

}

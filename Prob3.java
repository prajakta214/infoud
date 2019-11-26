package com.infoud.hashsets;

import java.util.HashSet;
import java.util.Set;

public class Prob3 {

	public Integer setSize(Set<String> set) {
		return set.size();
	}

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("Pink");
		set1.add("Green");
		set1.add("Black");
		set1.add("Yellow");
		Prob3 prob3 = new Prob3();
		System.out.println("Elements in set: " + prob3.setSize(set1));
	}

}

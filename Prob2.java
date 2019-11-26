package com.infoud.hashsets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prob2 {

	public Set<String> iterarteSet(Set<String> set) {
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		return set;
	}

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>();
		set1.add("Pink");
		set1.add("Green");
		set1.add("Black");
		set1.add("Yellow");

		System.out.println("Set elements: ");
		Prob2 prob2 = new Prob2();
		prob2.iterarteSet(set1);
		/*
		 * Iterator<String> i = set1.iterator(); while(i.hasNext()){
		 * System.out.println( i.next()); }
		 */
	}

}

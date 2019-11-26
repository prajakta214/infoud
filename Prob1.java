package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Prob1 {
	Map<Integer, String> map = new HashMap<Integer, String>();

	public Map<Integer, String> addElements(Integer i, String s) {
		/*
		 * System.out.println(map.put(1, "Pink")); System.out.println(map.put(2,
		 * "Green")); System.out.println(map.put(3, "Black"));
		 */
		map.put(i, s);
		return map;
	}

	public static void main(String[] args) {

		Prob1 prob1 = new Prob1();
		/*
		 * System.out.println("Map Elements: ");
		 * System.out.println("Value of 1: "+ map1.get(1)) ;
		 * System.out.println("Value of 2: "+ map1.get(2)) ;
		 * System.out.println("Value of 3: "+ map1.get(3)) ; Set<Integer> set1 =
		 * prob1.map.keySet(); for (Integer i : set1) {
		 */
		
		System.out.println(prob1.addElements(1, "Pink") + ""
				+ prob1.addElements(2, "Red") + ""
				+ prob1.addElements(3, "Black"));
	}

}

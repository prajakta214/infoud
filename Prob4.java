package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Prob4 {

	public Map<Integer, Integer>clearMap(Map<Integer, Integer>map){
		map.clear();
		return map;
		
	}
	
	public static void main(String[] args) {

		Map<Integer, Integer>map1 = new HashMap<Integer, Integer>();
		map1.put(1, 152);
		map1.put(2, 456);
		map1.put(3, 753);
		System.out.println("Original map::"+map1);
		Prob4 prob4=new Prob4();
		
		prob4.clearMap(map1);
		Set<Integer> set1 = map1.keySet();
		System.out.println("After clearing Map 1: ");
		for (Integer i : set1) {
			System.out.println("Key: " + i + " " + " Value: " + map1.get(i));
		}	}

}

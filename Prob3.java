package com.infoud.hashmaps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Prob3 {

	public Map<Integer, Integer>putAllElements(Map<Integer, Integer>map,Map<Integer, Integer>map2){
		map2.putAll(map);
		return map2;
	}
	public static void main(String[] args) {

		Map<Integer, Integer>map1=new HashMap<Integer, Integer>();
		map1.put(1, 100);
		map1.put(2, 200);
		map1.put(3, 300);
		Set<Integer> set1 = map1.keySet();
		System.out.println("Map 1: ");
		for (Integer i : set1) {
			System.out.println("Key: " + i + " " + " Value: " + map1.get(i));
		}
		Map<Integer, Integer>map2=new HashMap<Integer, Integer>();
		Prob3 prob3=new Prob3();
		prob3.putAllElements(map1, map2);
		
		System.out.println("Map 2: ");
		for (Integer i : set1) {
			System.out.println("Key: " + i + " " + " Value: " + map1.get(i));
		}	}

}

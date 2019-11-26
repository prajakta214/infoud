package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Prob6 {

	public boolean containsKey(Map<Integer, Integer> map, Integer i) {
		return map.containsKey(i);

	}
	public static void main(String[] args) {
		Map<Integer, Integer>map1 = new HashMap<Integer, Integer>();
		map1.put(1, 152);
		map1.put(2, 456);
		map1.put(3, 753);
		Prob6 prob6=new Prob6();
		System.out.println(prob6.containsKey(map1, 1));
	}

}

package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Prob7 {

	public boolean containsValue(Map<Integer, Integer> map, Integer i) {
		return map.containsValue(i);

	}
	public static void main(String[] args) {
		Map<Integer, Integer>map1 = new HashMap<Integer, Integer>();
		map1.put(1, 152);
		map1.put(2, 456);
		map1.put(3, 753);
		Prob7 prob7=new Prob7();
		System.out.println(prob7.containsValue(map1, 456));
	}

}

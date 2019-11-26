package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Prob5 {

	public boolean checkMapIsEmpty(Map<Integer, Integer> map) {
		return map.isEmpty();

	}

	public static void main(String[] args) {
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		map1.put(1, 152);
		map1.put(2, 456);
		map1.put(3, 753);
		Prob5 prob5 = new Prob5();
		System.out.println("Is Map empty?? " + prob5.checkMapIsEmpty(map1));
	}

}

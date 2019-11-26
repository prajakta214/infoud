package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Prob8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, Integer>map1 = new HashMap<Integer, Integer>();
		map1.put(1, 152);
		map1.put(2, 456);
		map1.put(3, 753);
		
		Set<Entry<Integer, Integer>> entry1 = map1.entrySet();
		for (Entry<Integer, Integer> i : entry1) {
			System.out.print(" Key: " + i.getKey());
			System.out.print(" Value: " + i.getValue());
			System.out.println();
		}
	}

}

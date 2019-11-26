package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Prob9 {

	public Integer getValue(Map<Integer, Integer>map, Integer i){
		return map.get(i);
	}
	public static void main(String[] args) {
		Map<Integer, Integer>map1 = new HashMap<Integer, Integer>();
		map1.put(1, 152);
		map1.put(2, 456);
		map1.put(3, 753);
		Prob9 prob9=new Prob9();
		System.out.println("Value of 1: "+ prob9.getValue(map1, 1));
	}

}

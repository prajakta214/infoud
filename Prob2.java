package com.infoud.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class Prob2 {

	public Integer checkMapSize(Map<Integer, Integer>map){
	return	map.size();
	}
	public static void main(String[] args) {

		Map<Integer, Integer>map1=new HashMap<Integer, Integer>();
		map1.put(1, 100);
		map1.put(2, 200);
		map1.put(3, 300);
		map1.put(4, 400);
		Prob2 prob2=new Prob2();
		System.out.println("Size of Mapping of key-value in map:" + prob2.checkMapSize(map1));
	}

}

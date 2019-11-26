package com.infoud.hashmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Prob10 {

	public Collection<String> getMapValues(Map<Integer, String>map){
	
		return map.values();
		
	}
	public static void main(String[] args) {
		Map<Integer, String>map1 = new HashMap<Integer, String>();
		map1.put(1, "152");
		map1.put(2, "456");
		map1.put(3, "753");
		Prob10 prob10=new Prob10();
		//Set<Integer>set1 = map1.keySet();
	System.out.println(prob10.getMapValues(map1));
		
	}

}

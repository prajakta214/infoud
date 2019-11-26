package com.infoud.hashsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Prob9 {

	public Set<String>sortHashSet(Set<String>set){
		Set<String> set2 = new TreeSet<String>(set);
		return set2;		

	}
	public static void main(String[] args) {
		Set<String> set1=new HashSet<String>();
		set1.add("Pink");
		set1.add("Green");
		set1.add("Black");
		set1.add("Yellow");
		
		//Collections.sort(set1);
		
		/*List<String>list1 = new ArrayList<String>(set1);
		Collections.sort(list1);*/
		
		Prob9 prob9=new Prob9();		
		System.out.println("Sorted Set Elements: "+prob9.sortHashSet(set1));
		
	}

}

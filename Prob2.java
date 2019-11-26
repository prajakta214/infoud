package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Prob2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String>list1 = new ArrayList<String>();
		list1.add("Green");
		list1.add("Purple");
		list1.add("Black");
		
		System.out.println("Elements of array List: ");
		
		Iterator<String> i = list1.iterator();
		 while(i.hasNext()){
	        	System.out.print("\t"+i.next());
	        }

		
		}
	}
	
	



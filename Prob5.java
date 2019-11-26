package com.infoud.linkedlist;

import java.util.LinkedList;
import java.util.List;


//------------------ display the elements and their positions in a linked list. -----------------------------------------//

public class Prob5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list1 = new LinkedList<String>();
	      list1.add("Red");
	      list1.add("Purple");
	      list1.add("Green");
	      list1.add("Blue");
	      System.out.println(list1);

	      for (int i = 0; i < list1.size(); i++) {
	    	  System.out.println("Element at index: " +i+ " is " + list1.get(i));
			
		}
	}

}

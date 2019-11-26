package com.infoud.linkedlist;

import java.util.LinkedList;
import java.util.List;


//---------------------------insert elements into the linked list at the first and last position--------------------------------------------//

public class Prob4 {

	
	
	
	public static void main(String[] args) {
		List<String> list1 = new LinkedList<String>();
	      list1.add("Red");
	      list1.add("Purple");
	      list1.add("Green");
	      list1.add("Blue");
	      System.out.println(list1);
	      
	      System.out.println("Add 'Black' at 1st position::");
	      list1.add(0, "Black");
	      System.out.println(list1);
	      System.out.println("Add 'White' at last postion::");
	      list1.add("White");
	      System.out.println(list1);
	}

}

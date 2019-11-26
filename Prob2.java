package com.infoud.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//------------------ Iterate over linkedlist -----------------------------------------//
public class Prob2 {

	public List<String>iterateLikedList(List<String>list){
		Iterator<String> i = list.iterator();
	    while(i.hasNext()){
	    	System.out.println(i.next());
	    }
		return list;
	}
	public static void main(String[] args) {
		List<String> list1 = new LinkedList<String>();
	      list1.add("Red");
	      list1.add("Purple");
	      list1.add("Green");
	      list1.add("Blue");
	      
	   Prob2 prob2=new Prob2();
	   prob2.iterateLikedList(list1);
	    
	    
	}

}

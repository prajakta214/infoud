package com.infoud.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Prob4 {

	private  List<String> list1=new ArrayList<String>();

	public List<String> getList1() {
		return list1;
	}

	public void setList1(List<String> list1) {
		this.list1 = list1;
	}

	public void add() {
		list1.add("Blue");
		list1.add("Green");
		list1.add("Purple");
		list1.add("white");

	}

	public String findElement(int i) {
		int size = list1.size();
		if(i>=size){
			return "Out of size.";
		}
		else{
			String s =list1.get(i);
			System.out.println("Element is:"+s);

			return s;

		}

	}

	
	  public static void main(String[] args) {
	  
	  Prob4 prob4=new Prob4();
	  prob4.add();
	  prob4.findElement(1);
		  
		  
	  /*System.out.println("Elements of List:"); for (String s : list1) {
	  System.out.println(s);
	  
	  } System.out.println("Element at position 2: " + list1.get(2));
	  */
	  }
	 
}

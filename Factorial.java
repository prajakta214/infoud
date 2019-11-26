package com.infoud.assignment;

import java.util.Scanner;

public class Factorial {

private int calculatefactorial(int number) throws Exception {
		
		if(number==1){
	         return 1;
	       }
		else if(number>1) {
			
		  int  output = calculatefactorial(number-1)* number;
			//System.out.println("fact:"+output);
		return output;
		}
		else {
			return -1;
		}
	}

	public int factorial1(int no) throws Exception {
		if(calculatefactorial( no)==-1) {
			System.out.println("entered incorrect number");
			throw new Exception("incorrect no entered");
		}
		else {
			System.out.println("Factorial of "+no+" is:");
			return calculatefactorial( no);
		}
		
	}


	public static void main(String[] args) throws Exception {
		 Scanner sc1=new Scanner(System.in);
			System.out.println("Enter no to find factorial:\n");
			int no=sc1.nextInt();	
			sc1.close();
			Factorial factorial=new Factorial();
			System.out.println(factorial.factorial1(no));
			//factorial(no, factorial.calculatefactorial(no));
			
	}

	}



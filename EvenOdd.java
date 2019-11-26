package com.infoud.assignment;

import java.util.Scanner;

public class EvenOdd {

	public String checkNo(int no) {
		if ((no % 2) == 0) {
			System.out.println(no + " is even.");
			return "even";
		} else {
			System.out.println(no + " is odd.");
			return "odd";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to check:\n");
		int number = sc.nextInt();
		sc.close();
		EvenOdd evenOdd = new EvenOdd();
		evenOdd.checkNo(number);
	}
}

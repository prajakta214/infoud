package com.infoud.intrest;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		int noOfYears, principleAmount, rateOfInterest;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of years: ");
		noOfYears = sc.nextInt();
		System.out.println("Enter principle amount: ");
		principleAmount = sc.nextInt();
		System.out.println("Enter rate of intrest: ");
		rateOfInterest = sc.nextInt();
		System.out.println(" *******  SIMPLE INTREST  *******");

		SimpleIntrest simpleIntrest = new SimpleIntrest(noOfYears,
				principleAmount, rateOfInterest);
		System.out.println("Simple Intrest :: "+ simpleIntrest.intrest());
		
		System.out.println(" *******  COMPOUND INTREST  *******");
		CompoundIntrest compoundIntrest=new CompoundIntrest(principleAmount, rateOfInterest, noOfYears);
		System.out.println("Compound Intrest :: " + compoundIntrest.intrest());
		
		
	}

}

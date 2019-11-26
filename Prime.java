package com.infoud.assignment;

import java.util.Scanner;

public class Prime {

	public String checkPrime(int no) throws Exception {
		int flag = 0;
		if (no <= 0) {
			throw new ArithmeticException("no is negative or zero");
		} else {
			for (int i = 2; i < no / 2; i++) {
				if (no % 2 == 0) {

					flag++;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(no + " is not a Prime Number");
				return "Not Prime Number";
			} else {
				System.out.println(no + " is a   Prime Number");
				return "Prime Number";
			}
		}

	}

	private boolean isPrime2(int n) {

		/*
		 * if (n <= 1) { System.out.println("no:"+(n)); return false; }
		 */
		for (int i = 2; i < n / 2; i++) {
			System.out.println(i);
			System.out.println(n + "%" + i + "=" + (n % i));
			if (n % i == 0) {
				System.out.println(n + "%" + i + "=" + (n % i));
				return false;
			}
		}
		System.out.println(n);
		return true;
	}

	public String primeCheck(int number) {
		if (number <= 1) {
			System.out.println("no:" + (number));
			throw new ArithmeticException("no is negative");
		} else {
			if (isPrime2(number)) {
				return "number is prime";
			} else {
				return "number is not prime";
			}

		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to check:");
		int number = sc.nextInt();
		sc.close();
		Prime prime = new Prime();

		System.out.println(prime.primeCheck(number));

	}

}

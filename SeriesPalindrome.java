package com.infoud.assignment;

import java.util.Scanner;

public class SeriesPalindrome {

	public String reverseSeriesmethod(int no) {

		if (no == 0) {
			throw new ArithmeticException(
					" number should not be  zero or negative");
		} else {
			int temp = no;
			int sum = 0;
			while (no > 0) {
				sum = sum * 10 + (no % 10);
				no = no / 10;
			}
			if (temp == sum) {
				return temp + " is palindrome";
			} else {
				//System.out.println("series " + temp + " is  not palindrome");
				return temp + "is not palindrome";

			}
		}

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Series of no:\n");
		int no = sc.nextInt();
		sc.close();

		SeriesPalindrome seriesPalindrome = new SeriesPalindrome();
		System.out.println(seriesPalindrome.reverseSeriesmethod(no));
	}

}

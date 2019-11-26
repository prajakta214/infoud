package com.infoud.assignment;

import java.util.Scanner;

public class ReverseSeries {

	private int no;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	/**
	 * @param no
	 */
	public ReverseSeries(int no) {

		this.no = no;
	}

	public int reverseSeriesmethod(int no) {
		if (no <= 0) {
			throw new ArithmeticException(
					"number should not be  zero or negative");
		} else {
			int sum = 0;
			while (no > 0) {
				sum = sum * 10 + (no % 10);
				no = no / 10;
			}
			System.out.println("Reverse series:" + sum);
			return sum;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Series of no:\n");
		int no = sc.nextInt();
		sc.close();

		ReverseSeries reverseSeries = new ReverseSeries(no);
		reverseSeries.reverseSeriesmethod(no);
	}

}

package com.infoud.assignment_1.piggibank;

public class AddAmount {

	private int amount = 50;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public AddAmount(int amount) {
		super();
		this.amount = amount + amount;
	}

	public AddAmount() {
		super();
	}

	public long addMoreAmount() {
		System.out.println("Final Amount = " + amount);
		return amount;

	}

}

package com.infoud.assignment_1.piggibank;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPiggiBank {

	private AddAmount addAmount;
	private AddAmount addAmount2;

	@Before
	public void before() {
		addAmount = new AddAmount();
		addAmount2 = new AddAmount(50);
	}

	@Test
	public void testAddAmountWithOutPassingAmount() {
		Assert.assertEquals(50, addAmount.addMoreAmount());
	}

	@Test
	public void testAddAmountWithPassingAmount() {
		Assert.assertEquals(100, addAmount2.addMoreAmount());
	}
}

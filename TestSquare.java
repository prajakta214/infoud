package com.infoud.designpatterns.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSquare {

	private Square square;

	@Before
	public void before() {
		square = new Square();
	}

	@Test
	public void testCircleDraw() {
		Assert.assertEquals(new String("In Square."), square.draw());
	}

}

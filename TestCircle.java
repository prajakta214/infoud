package com.infoud.designpatterns.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCircle {

	private Circle circle;

	@Before
	public void before() {
		circle = new Circle();
	}

	@Test
	public void testCircleDraw() {
		Assert.assertEquals(new String("In Circle."), circle.draw());
	}
}

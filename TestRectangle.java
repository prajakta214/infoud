package com.infoud.designpatterns.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestRectangle {
	private Rectangle rectangle;

	@Before
	public void before() {
		rectangle = new Rectangle();
	}

	@Test
	public void testCircleDraw() {
		Assert.assertEquals(new String("In Rectangle."), rectangle.draw());
	}

}

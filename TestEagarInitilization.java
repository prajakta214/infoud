package com.infoud.designpatterns.singletone;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEagarInitilization {
	EagarInitilization con1;
	EagarInitilization con2;

	@Before
	public void before() {
		con1 = EagarInitilization.getCon();
		con2 = EagarInitilization.getCon();

	}

	@Test
	public void testGetSize1stTime() {
		Assert.assertEquals(new Integer(20), con1.getSize());
	}

	@Test
	public void testGetSize2ndTime() {
		Assert.assertEquals(new Integer(20), con2.getSize());
	}
	
	@Test
	public void testGetName1stTime() {
		Assert.assertEquals(new String("Prajakta"), con1.getName());
	}
	
	@Test
	public void testGetName2ndTime() {
		Assert.assertEquals(new String("Prajakta"), con2.getName());
	}
}

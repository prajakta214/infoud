package com.infoud.assignment_1.student;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStudDetails {

	private StudentDetails studentDetails;
	private StudentDetails studentDetails2;

	@Before
	public void before() {
		studentDetails = new StudentDetails("Borivali", "abc@gmail.com");
		studentDetails2 = new StudentDetails("Prajakta", "Badlapur",
				"ppp12@gmail.com");
	}

	@Test
	public void testStudDetailsWith2Parameters() {
		Assert.assertEquals(new String(
				"Name: Unknown\nAddress: Borivali\nEmail: abc@gmail.com"),
				studentDetails.printDetails());
	}
	
	@Test
	public void testStudDetailsWith3Parameters() {
		Assert.assertEquals(new String(
				"Name: Prajakta\nAddress: Badlapur\nEmail: ppp12@gmail.com"),
				studentDetails2.printDetails());
	}
}

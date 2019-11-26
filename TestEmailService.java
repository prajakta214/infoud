package com.infoud.dependency.injection;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestEmailService {

	private static EmailService emailService;

	@BeforeClass
	public static void beforeClass() {

		emailService = new EmailService();
		System.out.println("Before class.");
	}

	@Test
	public void emailIDWithSymbol() {

		boolean s = emailService.sendEmail("Hello", "abc@gmail.com");
		Assert.assertTrue(s);

	}

	@Test
	public void emailIDWithotSymbol() {

		boolean s = emailService.sendEmail("Hello", "abcgmail.com");
		Assert.assertFalse(s);

	}

}

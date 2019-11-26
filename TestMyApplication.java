package com.infoud.dependency.injection;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyApplication {

	private static MyApplication myApplication;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class. ");
		//Dependency injection using constructor.
		//myApplication = new MyApplication(new EmailService());
		
		//Dependency injection using setter
		myApplication= new MyApplication();
		myApplication.setEmailService(new EmailService());
	}

	@Test
	public void testSendMessage() {

		boolean b = myApplication.sendMessage("Hello ", "abc@gmail.com");
		Assert.assertTrue(b);

	}

	@Test
	public void testMessageNotSend() {

		boolean b = myApplication.sendMessage("Hello ", "abcgmail.com");
		Assert.assertFalse(b);

	}

}

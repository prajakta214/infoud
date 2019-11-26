package com.infoud.dependency.injection;

public class MyApplication {

	private EmailService emailService;

	// EmailService emailService= new EmailService();

	// DEpendency injection using constructor.
	/*public MyApplication(EmailService emailService) {
		super();
		this.emailService = emailService;
	}*/

	// Dependency injection using setter.
	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	public boolean sendMessage(String msg, String emailId) {

		return emailService.sendEmail(msg, emailId);
	}

}

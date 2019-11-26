package com.infoud.dependency.injection;


public class EmailService {

	
	public boolean sendEmail(String msg , String emailId){
		
	
		System.out.println("Send " +msg+ " to "+emailId);
	
		
		if(emailId.contains("@")){
		return true;
		}
		else
			return false;
	}
	
	
}

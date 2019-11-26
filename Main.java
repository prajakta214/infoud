package com.infoud.assignment_1.student;

public class Main {

	public static void main(String[] args) {
		StudentDetails studentDetails = new StudentDetails("Borivali",
				"abc@gmail.com");
		StudentDetails studentDetails2 = new StudentDetails("Prajakta",
				"Badlapur", "psk@gmail.com");
		studentDetails.printDetails();
		studentDetails2.printDetails();
	}

}

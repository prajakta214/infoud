package com.infoud.assignment_1.programming;

public class Programming {
	
	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Programming() {
		super();
		this.language = "Programming Lang.";
	}

	public Programming(String language) {
		super();
		this.language = language;
	}
	
	public String print(){
		return "I Love " + language;
	}

}

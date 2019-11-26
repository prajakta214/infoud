package com.infoud.intrest;

public class SimpleIntrest implements Intrest {

	private int noOfYears;
	private int principleAmount;
	private int rateOfInterest;
	
	
	
	
	
	public SimpleIntrest(int noOfYears, int principleAmount, int rateOfInterest) {
		super();
		this.noOfYears = noOfYears;
		this.principleAmount = principleAmount;
		this.rateOfInterest = rateOfInterest;
	}





	public SimpleIntrest() {
		super();
	}





	@Override
	public double intrest() {
		
		return ((noOfYears*principleAmount*rateOfInterest)/100);


	}

}

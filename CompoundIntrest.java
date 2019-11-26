package com.infoud.intrest;

public class CompoundIntrest implements Intrest {

	private int principleAmount;
 	private int rateOfInterest;
	private double noOfYears;
	
	
	
	
	public CompoundIntrest(int principleAmount, int rateOfInterest,
			double noOfYears) {
		super();
		this.principleAmount = principleAmount;
		this.rateOfInterest = rateOfInterest;
		this.noOfYears = noOfYears;
	}

 


	public CompoundIntrest() {
		super();
	}




	@Override
	public double intrest() {
		
		return principleAmount*(Math.pow((1+(rateOfInterest/100)),noOfYears));
	}

	
	
	

}

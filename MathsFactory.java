package com.infoud.maths;


public class MathsFactory {
	
	public static Maths getOperation(OperationType operationType){
		
		switch(operationType){
		
		case ADDITION:
			return new Addition();
		case SUBTRACTION:
			return new Subratction();
		case MULTIPLICATION:
			return new Multiplication();
		case DIVISION:
			return new Division();
        default: 
        	return null;
		}
	}

}

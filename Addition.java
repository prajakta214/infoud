package com.infoud.maths;

public class Addition implements Maths{

	@Override
	public Integer Operation(Integer a, Integer b) {
		
		
		if(a== null || b==null || a==null && b==null){
			return null;
		}
		
		else
		return a+b;

	}

	
}

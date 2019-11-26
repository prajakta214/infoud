package com.infoud.depinjection;

public class Division implements Maths{

	@Override
	public Integer Operation(Integer a, Integer b) {

        if(a==null || b==null || a==null && b==null){
        	return null;
        }
        else
		return a/b;
	}

}

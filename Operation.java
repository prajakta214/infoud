package com.infoud.depinjection;

public class Operation {

	private Maths maths;

	public Operation(Maths maths) {
		super();
		this.maths = maths;
	}

	public Integer Perform(Integer a, Integer b) {

		return maths.Operation(a, b);

	}

}

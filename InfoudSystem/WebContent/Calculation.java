package com.infoud.area;

public class Calculation {
	
	private Shape shape;

	public Calculation(Shape shape) {
		super();
		this.shape = shape;
	}
	
	public double Area(){
		return shape.area();
	}
	
	public double Volume(){
		return shape.volume();
	}

}

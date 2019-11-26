package com.infoud.area;

public class Circle implements Shape {
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	
	
	public Circle() {
		super();
	}



	@Override
	public double area() {
		return (3.142) * (radius * radius);
	}
	
	@Override
	public double volume() {
		return (3.142) * (radius * radius * radius);
	}
	
}

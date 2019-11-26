package com.infoud.area;

public class Rectangle implements Shape {

	private int length, breadth, depth;
	
	public Rectangle(int length, int breadth, int depth) {
		this.length = length;
		this.breadth = breadth;
		this.depth = depth;
	}
	
	
	public Rectangle() {
		super();
	}


	@Override
	public double area() {
		return length * breadth;
	}
	
	@Override
	public double volume() {
		return length * breadth * depth;
	}
}

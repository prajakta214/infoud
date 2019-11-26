package com.infoud.area;

public class Triangle implements Shape {
	
	private int base, height;

	

	public Triangle() {
		super();
	}

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return ((base*height)/2);
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}
}

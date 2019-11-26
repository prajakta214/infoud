package com.infoud.designpatterns.factory;

public class Main {

	
	public static void main(String[] args) {
		
		
		
		Shape shape = ShapeFactory.getShape(ShapeType.CIRCLE);
		shape.draw();
		
		Shape shape1 = ShapeFactory.getShape(ShapeType.SQUARE);
		shape1.draw();
		
		Shape shape2 = ShapeFactory.getShape(ShapeType.RECTANGLE);
		shape2.draw();
		
		Shape shape3=ShapeFactory.getShape(null);
		shape3.draw();
		
		
	}

}

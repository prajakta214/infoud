package com.infoud.area;



public class ShapeFactory {

public static Shape getShape(ShapeTypes type){
		
		switch (type) {
		case CIRCLE:
			return new Circle();
		case SQUARE:
			return new Square();
		case RECTANGLE:
			return new Rectangle();
		case TRIANGLE:
		     return new Triangle();
        default: 
        	return null;
		
		}
		
		
	}
}

package com.infoud.area;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		int radius, length, breadth, base, height, depth;
		Scanner sc = new Scanner(System.in);
		//Shape shape = new Shape();
	
		System.out.println(" *******   AREA OF DIFFERENT SHAPES  *******");
		while (true) {
			System.out
					.println("1.Circle \n2.Square \n3.Rectangle \n4.Triangle \n5.Exit");
			System.out.println("Enter your choice :");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter radius of circle: ");
				radius = sc.nextInt();
				Circle circle = new Circle(radius);
				System.out.println("Area of circle is: " + circle.area());
				System.out.println("Volume of circle is: " + circle.volume());

				break;
			case 2:
				System.out.println("Enter lenght of square: ");
				length = sc.nextInt();
				Square square = new Square(length);
				System.out.println("Area of square is: " +square.area());
				System.out.println("Volume of square is: " +square.volume());
				break;
			case 3:
				System.out.println("Enter lenght: ");
				length = sc.nextInt();
				System.out.println("Enter breadth: ");
				breadth = sc.nextInt();
				System.out.println("Enter depth: ");
				depth = sc.nextInt();
				Rectangle rectangle = new Rectangle(length, breadth, depth);
                System.out.println("Area of Rectangle is: " +rectangle.area());
                System.out.println("Volume of Rectangle is: " +rectangle.volume());
				break;
			case 4:
				System.out.println("Enter base: ");
				base = sc.nextInt();
				System.out.println("Enter height: ");
				height = sc.nextInt();
				Triangle triangle = new Triangle(base,height);
				System.out.println("Area of Triangle is: " +triangle.area());
				System.out.println("Volume of Triangle is: " +triangle.volume());
				break;
			case 5:
				System.out.println("Exit.");
				System.exit(0);
				break;
			default:
				System.out.println("Please enter the correct choice.\n");

			}

		}
	}

}

package com.infoud.designpatterns.singletone;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Eagar Initilazation:::");
		EagarInitilization con1 = EagarInitilization.getCon();
		System.out.println(con1);
		System.out.println(con1.getSize());
		System.out.println(con1.getName());

		EagarInitilization con2 = EagarInitilization.getCon();
		System.out.println(con2);

		System.out.println(con2.getSize());
		System.out.println(con2.getName());

		System.out.println("Lazy Initilazation:::");

		LazyInitilazation con3 = LazyInitilazation.getCon();
		System.out.println(con3);
		System.out.println(con3.getSize());
		System.out.println(con3.getName());

		LazyInitilazation con4 = LazyInitilazation.getCon();
		System.out.println(con4);
		System.out.println(con4.getSize());
		System.out.println(con4.getName());

	}

}

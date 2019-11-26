package com.infoud.designpatterns.singletone;

//  --------------------- Eagar Initilization -------------------------------------//

public class EagarInitilization {

	private Integer size;
	private String name;

	public Integer getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	private EagarInitilization() {
		super();
		this.size = 20;
		this.name = "Prajakta";
	}

	private static EagarInitilization con = new EagarInitilization();

	public static EagarInitilization getCon() {
		return con;
	}

}

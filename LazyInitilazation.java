package com.infoud.designpatterns.singletone;

public class LazyInitilazation {

	private Integer size;
	private String name;

	public Integer getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	private LazyInitilazation() {
		super();
		this.size = 20;
		this.name = "Prajakta";
	}

	private static LazyInitilazation con ;

	public static LazyInitilazation getCon() {
		
		if(con == null){
			con=new LazyInitilazation();
		}
		return con;
	}

	
	

}

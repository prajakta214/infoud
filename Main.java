package com.infoud.structuralpatterns.proxy;

public class Main {

	public static void main(String[] args) {

		ComputerCommand cep = new CommandExecutorProxy("admin");
		cep.run("delete file");

		ComputerCommand cep1 = new CommandExecutorProxy("prajakta");
		cep1.run("delete file");
	}

}

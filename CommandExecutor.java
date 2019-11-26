package com.infoud.structuralpatterns.proxy;

public class CommandExecutor implements ComputerCommand {

	@Override
	public String run(String cmd) {
		System.out.println("Command run. ");
		return cmd;
	}

}

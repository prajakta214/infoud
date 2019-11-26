package com.infoud.structuralpatterns.proxy;

public class CommandExecutorProxy implements ComputerCommand {

	private String userName;

	public CommandExecutorProxy(String userName) {
		super();
		this.userName = userName;
	}

	private CommandExecutor ce = new CommandExecutor();

	@Override
	public String run(String cmd) {

		System.out.println(userName + " access to " + cmd );
		if (userName.equals("admin")) {
			ce.run(cmd);
		}
		return cmd;

	}

}

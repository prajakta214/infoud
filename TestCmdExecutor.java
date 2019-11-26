package com.infoud.structuralpatterns.proxy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCmdExecutor {

	private CommandExecutor commandExecutor;

	@Before
	public void before() {
		commandExecutor = new CommandExecutor();
	}

	@Test
	public void testRun() {
		Assert.assertEquals(new String("delete file"),
				commandExecutor.run("delete file"));
	}

}

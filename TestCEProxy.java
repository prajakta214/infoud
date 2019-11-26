package com.infoud.structuralpatterns.proxy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCEProxy {

	ComputerCommand cep;
	ComputerCommand cep1;

	@Before
	public void before() {
		cep = new CommandExecutorProxy("admin");
		cep1 = new CommandExecutorProxy("prajakta");
	}

	@Test
	public void testRunByAdmin() {
		Assert.assertEquals(new String("delete file"), cep.run("delete file"));
	}

	@Test
	public void testRunByPrajakta() {
		Assert.assertEquals(new String("delete file"), cep1.run("delete file"));
	}

}

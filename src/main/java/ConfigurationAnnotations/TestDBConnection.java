package ConfigurationAnnotations;

import org.testng.annotations.Test;

import BaseTest.BaseTest;

public class TestDBConnection extends BaseTest{
	@Test
	public void runOtherTest1() {
		System.out.println("@Test - runOtherTest1");
	}

	@Test
	public void runOtherTest2() {
		System.out.println("@Test - runOtherTest2");
	}
}

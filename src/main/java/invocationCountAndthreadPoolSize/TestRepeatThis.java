package invocationCountAndthreadPoolSize;

import org.testng.annotations.Test;

public class TestRepeatThis {
	@Test(invocationCount = 10)
	public void repeatThis() {
		System.out.println("repeatThis ");
	}
}

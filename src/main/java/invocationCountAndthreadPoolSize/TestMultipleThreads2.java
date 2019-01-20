package invocationCountAndthreadPoolSize;

import org.testng.annotations.Test;

public class TestMultipleThreads2 {
	@Test(invocationCount = 10, threadPoolSize = 3)
	public void testThreadPools() {

		System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());

	}
}

package invocationCountAndthreadPoolSize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

@Test(invocationCount = 2)
public class TestMultipleThreads {
	public void loadTestThisWebsite() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");// 这一步必不可少
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.yiibai.com");
		System.out.println("Page Title is " + driver.getTitle());
		try {
			AssertJUnit.assertEquals("Google", driver.getTitle());
			}
		
		
		finally {
			driver.quit();
			}
		

	}
}

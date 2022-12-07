package assignment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrderOfTest {

	// Q17) How to control the order of test execution in TestNG?
	
	@Test(priority=1)
	public void openBrowser()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	
	@Test(priority=2)
	public void close() {
		
		WebDriver driver = new ChromeDriver();
		driver.quit();
	}
	
}


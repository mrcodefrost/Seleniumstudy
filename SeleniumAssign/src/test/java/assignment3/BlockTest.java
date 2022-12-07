package assignment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlockTest {

	// Q16: How to block a test method from execution in TestNG
	@Parameters("url")
	@Test
	public void LoginTest(String url) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
	}
	
	@Test(enabled=false)
	public void blockedMethod() {
		System.out.println("This method is blocked");
	}
	
	
	
	
}


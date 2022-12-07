package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUpDown {

	// Q20) Write a Java Program to demonstrate Scroll up/ Scroll down
	
	@Test
	public void ScrollFunction() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement down = driver.findElement(By.xpath("//div[@class=\"LfkXVL\"]//span"));
		int locDown=down.getLocation().y;
		WebElement up = driver.findElement(By.xpath("//div[@class=\"_2Xfa2_\"]"));
		int locUp=up.getLocation().y;
		
		js.executeScript("window.scrollTo(0,"+locDown+")");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,"+locUp+")");
		
	}
	
	
	@AfterTest
	public void close()
	{
	WebDriver driver = new ChromeDriver();
	driver.quit();
	}
}
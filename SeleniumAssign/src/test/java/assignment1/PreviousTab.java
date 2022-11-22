package assignment1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PreviousTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
		 
		 ChromeDriver driver = new ChromeDriver();
		 
//		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.google.com");
		
		//String currentTab = driver.getWindowHandle();
		
       driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("facebook");
		
//		element.sendKeys("facebook");
//		element.sendKeys(Keys.ENTER);
		
	}

}

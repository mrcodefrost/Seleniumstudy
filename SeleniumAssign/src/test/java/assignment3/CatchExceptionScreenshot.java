package assignment3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CatchExceptionScreenshot {
	
	// Q10: How would you automatically click a screenshot whenever an exception occurs?
	
	  public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();

	    try {
	      driver.get("https://www.google.com");

	      // Try to click an element that does not exist
	      driver.findElement(By.id("//input[@class='gLFyg']")).click();
	    } catch (Exception e) {
	      // ss if an exception occurs
	      File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	      try {
	        // Save the ss to a file
	        FileUtils.copyFile(screenshot, new File("exception-screenshot.png"));
	      } catch (IOException ioe) {
	        
	    	  System.out.println("Handle the error if the screenshot could not be saved");

	      }
	    }
	    driver.quit();
	  }
	}

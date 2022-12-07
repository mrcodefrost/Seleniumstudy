package assignment3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingaporeAirlinesAlert {
	
	// Q12) How would you handle the alert popups in Selenium Webdriver
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.singaporeair.com/en_UK/sg/home");

		driver.findElement(By.id("bookFlight")).click();

		// Wait for the alert to appear
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		// Get the alert
		Alert alert = driver.switchTo().alert();

		// Use the accept method to handle the alert
		alert.accept();
		driver.quit();
	}
}

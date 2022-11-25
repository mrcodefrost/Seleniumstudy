package assignment2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmiCalculatorGraph {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		// in the above two lines
		// Using a plugin to avoid need of system property and driver executable

		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		
		
		
		List<WebElement> bars = driver.findElements(By.xpath("//*[local-name()='svg']//*[name()='g' and @data-z-index='3']//*[name()='rect']")); 
		String barData = "//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']";
		
		Actions action = new Actions(driver);
		
		
		for(WebElement e : bars) {
			action.moveToElement(e).build().perform();
			Thread.sleep(500);
			System.out.println(driver.findElement(By.xpath(barData)).getText());
		}

	}
	
}

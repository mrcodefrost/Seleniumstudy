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

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		// in the above two lines
		// Using a plugin to avoid need of system property and driver executable

		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://emicalculator.net/");
		driver.manage().window().maximize();
		
		
		
		List<WebElement> bars = driver.findElements(By.xpath("//*[local-name()='svg']//*[name()='g' and @data-z-index='3']//*[name()='rect']")); 
		List<WebElement> barData = driver.findElements(By.xpath("//*[local-name()='svg']//*[name()='g' and @class='highcharts-label highcharts-tooltip highcharts-color-undefined']//*[name()='text']"));
		
		Actions action = new Actions(driver);
		
		for(int i=0; i<bars.size();i++) {
			action.moveToElement(bars.get(i)).build().perform();
			System.out.println(barData.get(i).getText());

		}
		
	
		System.out.println(barData.get(1).getText());
	
		
		
//		for(int i=0; i<barData.size(); i++) {
//			System.out.println(barData.get(i).getText());
//		}
//		
	
	}
	
}

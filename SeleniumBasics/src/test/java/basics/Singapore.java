package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Singapore {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		
		driver.get("https://www.singaporeair.com/en_UK/in/home");
		
		WebElement dropmenu = driver.findElement(By.xpath("//input[@id='flightClass1']"));
		int loc=dropmenu.getLocation().y;

		js.executeScript("window.scrollTo(0,"+loc+")");
		Thread.sleep(2000);
		dropmenu.click();
		List <WebElement> DropDownElements = driver.findElements(By.xpath("//div[not(@class=\"suggest-item selected\")]//div[@class='suggest-item']"));
		int size = DropDownElements.size();
		System.out.println(size);
		
		
		
	}
}

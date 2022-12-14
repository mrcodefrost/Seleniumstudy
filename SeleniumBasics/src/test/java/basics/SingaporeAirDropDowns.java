package basics;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingaporeAirDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set <String> tabs = driver.getWindowHandles();
		
		Iterator <String> it = tabs.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		Thread.sleep(2000);
		
		driver.get("https://www.singaporeair.com");
		WebElement dropmenu = driver.findElement(By.xpath("//input[@id='flightClass1']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		
		
		

//		int yaxis = dropmenu.getLocation().y;
//		int xaxis = dropmenu.getLocation().x;
		
		
	
//	JavascriptExecutor js = (JavascriptExecutor) driver;  
//		js.executeScript("window.scrollTo(0,"+yaxis+")");
//	dropmenu.click();
//		
//		List <WebElement> DropDownElements = driver.findElements(By.xpath("//div[not(@class=\"suggest-item selected\")]//div[@class='suggest-item']"));
//		DropDownElements.size();
//		System.out.println(DropDownElements.size());
//		
		Thread.sleep(5000);
		driver.quit();
		
		
	}
	
	
}

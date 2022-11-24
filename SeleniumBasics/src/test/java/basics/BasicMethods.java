package basics;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicMethods {

	
	public static void main(String[] args) {
		
		// get(Java.lang.String url) - load a new webpage in the current browser window 
		// manage() - gets the option interface
		// getCurrentUrl() - get a string representing the current url that the browser is looking at 
		// getTitle() - the title of the current page 
		// getPageSource() - get the source of the last loaded page
		// navigate() - an abstraction allowing the driver to access the browser's history and navigate to a given URL
		// quit() - Quits the driver, closing every associated window
		// close() - close the current window, quitting the browser if it's the last window currently open 
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		String title = driver.getTitle();
		String pageSource = driver.getPageSource();
		
		System.out.println(currentUrl);
		System.out.println(title);
		System.out.println(pageSource);
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		List <WebElement> webElements = driver.findElements(By.xpath("//div[@class='inventory_list']//div[@class='inventory_item']"));
		System.out.println(webElements);
		
		driver.navigate().to("https://www.microsoft.com/en-in/");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		driver.findElement(By.xpath("//a[@class=' cta  ' and @aria-label='Learn more about Surface Laptop 5.']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
	}
	
	
}

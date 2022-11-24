package basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("daksh");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		List <WebElement> links = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println(links.size());
	
		
		
		for(int i=0;i<links.size();++i) {
			System.out.println(links.get(i).getText());
			if(links.get(i).getText().equals("daksh prajapati")) {
				links.get(i).click();
			}
		}
		
	}
	
}

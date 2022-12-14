package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameHandling {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		WebElement webEle = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]"));
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"frame1\"]"));
		driver.switchTo().frame(frame);
		
		WebElement f = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));

		String name = f.getText();
		System.out.println(name);
		
		
		
	}
}

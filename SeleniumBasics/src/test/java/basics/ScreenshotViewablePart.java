package basics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotViewablePart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String url = "https://www.tutorialspoint.com/about/about_careers.htm";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		// locating the logo to SS
		WebElement w = driver.findElement(By.xpath("//*[@class='top-logo']"));
		
		// SS taken
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// storing SS
		BufferedImage f = ImageIO.read(s);
		
		
	}
	
	
	
}

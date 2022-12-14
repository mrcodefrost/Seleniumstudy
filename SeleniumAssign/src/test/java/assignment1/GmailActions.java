package assignment1;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailActions {

	
	public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.google.com/search?q=gmail&rlz=1C1CHBF_enIN1027IN1027&oq=gmail&aqs=chrome.0.69i59.865j0j1&sourceid=chrome&ie=UTF-8");

        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='search']//a"));

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).build().perform();

        System.out.println(elements.size());
        for(WebElement links : elements)
        {
            links.click();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(links.getText());
        }
        actions.keyDown(Keys.CONTROL).build().perform();
        
        
       WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
       
       

    }
	
}

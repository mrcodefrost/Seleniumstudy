package assignment1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailWithoutAction {

	public static void main(String[] args)   {
      
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.edgedriver().setup();
		

		WebDriver driver = new ChromeDriver();
//		FirefoxDriver driver = new FirefoxDriver();
//		EdgeDriver driver = new EdgeDriver();
		
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.google.com/search?q=gmail&rlz=1C1CHBF_enIN1027IN1027&oq=gmail&aqs=chrome.0.69i59.865j0j1&sourceid=chrome&ie=UTF-8");
//        Thread.sleep(20000);
        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='search']//a"));

        System.out.println(elements.size());
        for(WebElement links : elements)
        {
            System.out.println(links.getText());
            links.click();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            driver.navigate().back();
//            Thread.sleep(2000);
//            driver.navigate().refresh();
        }

    }
	
}

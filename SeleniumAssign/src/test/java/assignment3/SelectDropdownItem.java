package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownItem {
	
	
	// Q14) In Selenium WebDriver, how do you select an item from a drop-down menu?
	
  public static void main(String[] args) {
	  
	  
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();

 
    driver.get("https://www.facebook.com/r.php");

    // Select the date of birth from the drop-down menus
    WebElement dayDropdown = driver.findElement(By.name("birthday_day"));
    WebElement monthDropdown = driver.findElement(By.name("birthday_month"));
    WebElement yearDropdown = driver.findElement(By.name("birthday_year"));
    Select daySelect = new Select(dayDropdown);
    Select monthSelect = new Select(monthDropdown);
    Select yearSelect = new Select(yearDropdown);
    daySelect.selectByValue("15");
    monthSelect.selectByVisibleText("Jan");
    yearSelect.selectByValue("1980");

    driver.findElement(By.xpath("//label[text()='Male']/input")).click();

    driver.quit();
  }
}

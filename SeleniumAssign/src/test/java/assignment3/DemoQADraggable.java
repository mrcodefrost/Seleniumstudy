package assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQADraggable {
	public static void main(String[] args) {

		// Q11: Give an example to perform drag and drop action In Selenium WebDriver

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/draggable");
		WebElement draggableElement = driver.findElement(By.id("draggable"));
		Actions actions = new Actions(driver);

		actions.dragAndDropBy(draggableElement, 100, 100).perform();
		driver.quit();
	}
}

package assignment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser {

	// Q13) What is the process to start the IE/Chrome browser

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		// Starts the Chrome browser
		WebDriver driver = new ChromeDriver();

		WebDriverManager.edgedriver().setup();

		// Starts the Edge browser
		WebDriver edriver = new EdgeDriver();

	}

}

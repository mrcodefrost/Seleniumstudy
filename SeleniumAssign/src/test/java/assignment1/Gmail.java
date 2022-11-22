package assignment1;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Gmail {

	public static void main(String[] args) throws Exception {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/search?q=gmail&source=hp&ei=mJJ0Y6GsBaeWseMPpPiagAk&iflsig=AJiK0e8AAAAAY3SgqIV-8rPxk2FWBKifm2CwaRdLxpyh&oq=gmail&gs_lcp=Cgdnd3Mtd2l6EAEYADILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMggIABCABBCxAzILCAAQgAQQsQMQgwEyCAgAEIAEELEDMgUIABCABDILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMggIABCABBCxAzIICAAQgAQQsQNQAFgaYJIoaABwAHgCgAG5AYgB8gSSAQMwLjSYAQCgAQE&sclient=gws-wiz");

        List<WebElement> list1=driver.findElements(By.xpath("//a/h3"));
        
        
        int size1=list1.size();
        System.out.println(size1);
        
        int m=0;
        
        for(int j=0;j<size1;j++)
        {
            
           
			while(m<size1)
            {
            
               if(j==m)
                {

            	   System.out.println(list1.get(j).getText());
                  
            	   list1.get(j).click();
                  Thread.sleep(3000);
                  
                 break;
               
                 }
            
            }
			 
        m++;
       
      driver.navigate().back();
      
      Thread.sleep(10000);
   
            
            
            }

                
        }


	}
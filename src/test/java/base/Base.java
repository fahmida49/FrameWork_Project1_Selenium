package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;

	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			
	}
		
	public static void navigateURL() {
		driver.get("http://sit.skyitschool.com");
	}
		
//	public static void click(String xPath) {----> Underneath of here making variable dynamic
//	driver.findElement(By.xpath(xPath)).click();---> so that any click method would work 
//	}	
	public static void click(By byObject) {
		driver.findElement(byObject).click();
	}
	public static void sendKeys(By byObject ,String sendValue) {
		driver.findElement(byObject).sendKeys(sendValue);
	}	
		
     public static String getText(By byObject) {
    	 //WebElement element = driver.findElement (By.xpath(x_v));		
		   String s = driver.findElement (byObject).getText();
		   return s;
		    
     }
     
     
    //public static void tearDown() {  
	//driver.quit();                         
  
	//}	
	
      
    
}//class

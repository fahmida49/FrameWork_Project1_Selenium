package test_Casse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_logo_appearnce_in_landing_Page extends Base {

	public static void main(String[] arges) {
		setup();
//
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver;
//		driver = new ChromeDriver();
		navigateURL();
		//driver.get("http://sit.skyitschool.com");

		// get the text Element and strore in variable
		// String s = driver.findElement(By.xpath("//h1[text()='MicroTech NA']")).getText();

		// get the text of that element
		String s =  getText(By.xpath("//h1[text()='MicroTech NA']"));
		
		// verify the text is "landing page"
		if (s.contentEquals("MicroTech NA"))
			System.out.println("We are in landing page");
		else
			System.out.println("We are not in landing page");

	}// main

}// class

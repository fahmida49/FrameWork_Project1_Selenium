package test_Casse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_Due_Projects_Text_in_HomePage extends Base {

	public static void main(String[] args) {

		setup();
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver;
//		driver = new ChromeDriver();
		// driver.get("http://sit.skyitschool.com");
		navigateURL();

		// driver.findElement(By.xpath("//a[text()='LOG IN']")).click();
		click(By.xpath("//a[text()='LOG IN']"));

		// driver.findElement(By.name("mailuid")).sendKeys("testpilot@gmail.com");
		sendKeys(By.name("mailuid"), "testpilot@gmail.com");

		// driver.findElement(By.name("pwd")).sendKeys("1234");
		sendKeys(By.name("pwd"), "1234");

		// driver.findElement(By.name("login-submit")).click();
		click(By.name("login-submit"));

		String s = driver.findElement(By.xpath("//h2[text()='Due Projects']")).getText();

		if (s.contentEquals("Due Projects"))
			System.out.println("pass");
		else
			System.out.println("Fail");

	}// main

}// class

package test_Casse;

import org.openqa.selenium.By;

import base.Base;

public class Log_in_As_An_Customer extends Base {

	public static void main(String[] args) {
		
		 setup();
		
		 navigateURL();
		//driver.findElement(By.xpath("//a[text()='LOG IN']")).click();
		click(By.xpath("//a[text()='LOG IN']"));
		
		//driver.findElement(By.xpath("//a[text()='Customer Login']")).click();
		click(By.xpath("//a[text()='Customer Login']"));
		
		//driver.findElement(By.name("mailuid")).sendKeys("david@gmail.com");
		sendKeys(By.name("mailuid"),"david@gmail.com");
		 
		//driver.findElement(By.name("pwd")).sendKeys("1234");
		sendKeys(By.name("pwd"),"1256");

		//driver.findElement(By.name("login-submit")).click();
        click(By.name("login-submit"));
     String  s =driver.findElement(By.xpath("//span[text()='Invalid username or password!']")).getText();
		
        if(s.contentEquals("Invalid username or password!"))
        	System.out.println("pass");
        else
        	System.out.println("fail");
        System.out.println("update");
		System.out.println("update by Asma");
		System.out.println("update By Mina Apu");
		System.out.println("update by mojib");
        //tearDown();
        
        
        
        ////li[@id="listaccountNav-signIn"]/a/span ----> for target
	}//main

}//class

/*Invalid pass msg show in login page

 Login as an Customer
I am in Landing Page
I Click on Login
Click Customer Login
I enter emailid "david@gmail.com"
I enter Passwordd "1256"
 I click loginn button 
I will check "Invalid user name and password" */
package com.sauceDemo.Testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POMclasses.LoginPOMclass;

public class TC01_VerifyLoginFunctionality 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		System.out.println("SauceDemo URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//loginPage elements find +action perform
		LoginPOMclass x = new LoginPOMclass(driver);
		
		x.sendusername();
		Thread.sleep(2000);
		System.out.println("username is entered");
		
		x.sendpassword();
		Thread.sleep(2000);
		System.out.println("password is entered");
		
		x.clickOLoginbutton();
		System.out.println("login button is clicked");
		
		//--homePage--validation
	       System.out.println("apply the validation");
			
		   String expectedTitle = "Swag Labs";    
			
		   String actualTitle = driver.getTitle();
		
		   if(expectedTitle.equals(actualTitle))
		   {
			   System.out.println("login functionality test case is passed");
		   }
		   else
		   {
			   System.out.println("login functionality test case is failed");
		   }

		   driver.quit();
	       System.out.println("browser is closed");
	       
	       System.out.println("end of Program");		

	}
}

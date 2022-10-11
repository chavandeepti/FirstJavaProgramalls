package com.sauceDemo.Testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POMclasses.HomePOMclass;
import com.sauceDemo.POMclasses.LoginPOMclass;

public class TC02_VerifyLogOutFunctionality 
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
		//loginfunctionality
		
		LoginPOMclass x = new LoginPOMclass(driver);
		x.sendusername();
		x.sendpassword();
		x.clickOLoginbutton();
		
		//home-page
		HomePOMclass y = new HomePOMclass(driver);
		y.clickMenuButton();
		y.clickLogOutButton();
		
		//login-page
		
		System.out.println("apply the validation");
		
		   String expectedTitle = "Swag Labs";    //dev/BA
			
		   String actualTitle = driver.getTitle();
		
		   if(expectedTitle.equals(actualTitle))
		   {
			   System.out.println("logOut functionality test case is passed");
		   }
		   else
		   {
			   System.out.println("logOut functionality test case is failed");
		   }

		   driver.quit();
	       System.out.println("browser is closed");
	       
	       System.out.println("end of Program");

		
	}
}

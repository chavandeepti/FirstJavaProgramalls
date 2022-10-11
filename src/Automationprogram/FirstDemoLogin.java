package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemoLogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		WebElement userName= driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		Thread.sleep(3000);
		
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(3000);
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		String expectedTitle="Swag Labs";
        String actualTitle = driver.getTitle();
        
      //home page
      		//validation apply

		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		
		driver.close();
		


		
		}
}

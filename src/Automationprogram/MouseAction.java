package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");

		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println(" URL is opened");
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
		 username.sendKeys("standard_user");
		 Thread.sleep(2000);
		 
		 WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		 password.sendKeys("secret_sauce");
		 Thread.sleep(2000);
		 
		 WebElement loginButton = driver.findElement(By.id("login-button"));
//		 loginButton.click();
		 
		 //mouse action clcik
		 
		 Actions act=new Actions(driver);
		 
//		 act.click(loginButton);  //not posssible
		 

		 act.click(loginButton).perform();
	}
}

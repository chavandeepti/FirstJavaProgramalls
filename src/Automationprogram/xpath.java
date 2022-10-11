package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		
		WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		Thread.sleep(3000);		
		
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		Thread.sleep(3000);	
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@id='login-button']"));
		loginbutton.click();
		
		System.out.println("login sucssful");
		
		
		
	}
}

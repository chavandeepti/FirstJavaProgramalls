package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbytext 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
//		Thread.sleep(3000);
		
//		WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
//		username.sendKeys("standard_user");
//		Thread.sleep(3000);
		
		WebElement forgottonPassword=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgottonPassword.click();
		
		WebElement button=driver.findElement(By.xpath("//input[contains(@class,'submit']"));
		button.click();
		
		
		
		
		
		
		
		
	}
}
//input[contains(@name,'password')]
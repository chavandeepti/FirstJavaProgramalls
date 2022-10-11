package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmclass 

{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://opensource-demo.orangehrmlive.com");
//		Thread.sleep(3000);
		
		WebElement userName= driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Admin");
//		Thread.sleep(3000);
		
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
//		Thread.sleep(3000);
		
//		WebElement loginbutton= driver.findElement(By.xpath("//input[@type='submit']"));
//		loginbutton.click();
		
		
		
		
		
		
		
		
		
		
	}

}

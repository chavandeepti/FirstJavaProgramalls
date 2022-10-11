package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement forgottonPassword=driver.findElement(By.partialLinkText("Forgotten password?"));
		forgottonPassword.click();
	}
}

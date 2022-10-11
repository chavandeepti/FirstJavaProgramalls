package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facbook1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		WebElement email= driver.findElement(By.id("email"));
		email.sendKeys("dipti.chavan.524934@facebook.com");
		Thread.sleep(3000);
		
		WebElement pass= driver.findElement(By.id("pass"));
		pass.sendKeys("00536685");
		Thread.sleep(3000);
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
		loginbutton.click();
		
		System.out.println("end of program");
	}
}

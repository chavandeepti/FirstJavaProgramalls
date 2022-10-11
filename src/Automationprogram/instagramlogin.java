package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramlogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
		
		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("diptichavan18");
		Thread.sleep(3000);
		
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Deeptik@186");
		Thread.sleep(3000);
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
		loginbutton.click();
		
		System.out.println("end pf program");
		
		
	}
}

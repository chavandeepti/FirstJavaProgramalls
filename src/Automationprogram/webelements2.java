package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements2 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("SauceDemo URL is opened");
		
		WebElement username=driver.findElement(By.id("user-name"));
		username.clear();
		username.sendKeys("standard_user");
		Thread.sleep(3000);
		
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("secret_sauce");
		Thread.sleep(3000);
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		
        loginButton.click();
        Thread.sleep(3000);

		WebElement bagEle= driver.findElement(By.xpath("(//button[text()='Add to cart'])[2]"));
		bagEle.click();
		
		WebElement basketEle= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		Thread.sleep(3000);
		String actualProductSelected =basketEle.getText();  //after execution will get this value
		System.out.println(actualProductSelected);
		
		String expectedProductSelected = "1";   //dev/BA
		
		if(expectedProductSelected.equals(actualProductSelected))
		{
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println("TC is failed");
		}

	}
}

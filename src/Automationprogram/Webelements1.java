package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements1
{
	public static void main(String[] args)
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
		
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		
        loginButton.click();
		
		//get methods
		String eleText = loginButton.getText();
		System.out.println("ele text->"+eleText);
		
		String eleAttri= loginButton.getAttribute("id");
		System.out.println("Attribute value of id is->"+eleAttri);
		
		String eleTagName= loginButton.getTagName();
		System.out.println("tagname of ele->"+eleTagName);
	

		
	}
	
}

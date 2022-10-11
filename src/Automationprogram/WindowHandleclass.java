package Automationprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleclass 
{
	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.saucedemo.com/");
		 
		//how to find the address of the webPage??
		
	     //getWindowHandle method
		
	String address=driver.getWindowHandle();
	System.out.println(address);
	
	String url = driver.getCurrentUrl();
	System.out.println(url);
	
	String title = driver.getTitle();
	System.out.println(title);

	
	}
}

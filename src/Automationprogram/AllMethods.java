package Automationprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//1.get method-use to open the url
		driver.get("https://www.facebook.com");
		
		//used to pause the script
		//3000 value-> 3 second
		Thread.sleep(2000);
		
		//2.navigate
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);
		//back
		driver.navigate().back();
		Thread.sleep(2000);
		//forward
		driver.navigate().forward();
		Thread.sleep(2000);
		//refresh
		driver.navigate().refresh();
		Thread.sleep(2000);
	
	}
}

package Automationprogram;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sizeofbrowser 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com");
		
		// browser set size
		
		Dimension d = new Dimension(200,500);
		driver.manage().window().setSize(d);
		
		// browser postion change
		Point p =new Point(200,300);
		driver.manage().window().setPosition(p);
	  }
}

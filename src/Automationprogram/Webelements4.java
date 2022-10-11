package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements4 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println("vctcpune URL is opened");
		Thread.sleep(5000);
		
		 WebElement textBoxEle = driver.findElement(By.xpath("//input[@id='autocomplete']"));
			boolean  result = textBoxEle.isEnabled();
			System.out.println("is element enabled??->"+result);    //true
			
			if(result == true)
			{
				textBoxEle.sendKeys("India");
			}
			else
			{
				System.out.println("we cant pass the text since the ele is disabaled");
			}
	}
}

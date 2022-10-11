package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements5 
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
		
		 WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
			
		boolean result =  radioButton1.isSelected();
		
		System.out.println("is element selected??-->"+result);
		
		if(result == false)
		{
			radioButton1.click();
			boolean result2 = radioButton1.isSelected();   //true
			System.out.println("is element selected after clicking on it??-->"+result2);
		}
		else
		{
			System.out.println("Radio button is already selected");
		}

	}
}

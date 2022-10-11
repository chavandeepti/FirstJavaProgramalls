package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownlist 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");

		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		System.out.println(" URL is opened");
		Thread.sleep(2000);
		
		WebElement dropdown =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		dropdown.click();
		//we cant select the options in dropdown
				//with the help of webelement/webdriver interface methods
				
				//selenium class
				//in const-always pass a dropdown element

		
		Select s = new Select(dropdown);
//		s.selectByIndex(0);
//		s.selectByValue(null);
//		s.selectByVisibleText(null);
		

		s.selectByValue("option2");
		

		
	  }
}

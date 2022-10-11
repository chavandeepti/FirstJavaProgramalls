package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartfashion 
{
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
	WebElement  element= driver.findElement(By.xpath("//img[@class='_396cs4  _3exPp9']"));
	element.click();
	WebElement  element1= driver.findElement(By.xpath("//div[text()='Fashion']"));
	
	Actions action= new Actions(driver);
	action.clickAndHold(element1).perform();
	
	WebElement  element2= driver.findElement(By.xpath("//*[@class='_3LU4EM']"));
	action.clickAndHold(element2).perform();
	
	
	WebElement  element3= driver.findElement(By.xpath("//div[@class='_3LU4EM']"));
	action.clickAndHold(element3).perform();
	
	
	}
}

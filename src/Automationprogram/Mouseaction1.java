package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");

		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://demoqa.com/buttons");
		System.out.println(" URL is opened");
		Thread.sleep(2000);
		
		WebElement rightClickButton=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
//		doubliclick.click();
		
		Actions act=new Actions(driver);
//		act.contextClick(rightClickButton).perform();
//		String expectedMessage="you have done right clcik ";
//		
//		WebElement messageDisplay= driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
//		 WebElement String actualMessage= messageDisplay.getText();       //actual
//		 
//		 if(expectedMessage.equals(actualMessage))
//		 {
//			 System.out.println("TC is passed");
//		 }
//		 else
//		 {
//			 System.out.println("TC is failed");
//		 }
		
       WebElement doublec= driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
       act.moveToElement.click(doublec).perform();
       act.doubleClick(doublec).perform();

	}
}

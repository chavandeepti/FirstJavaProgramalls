package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardaction
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");

		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
        driver.get("https://the-internet.herokuapp.com/key_presses");
		
		
		WebElement textBox =driver.findElement(By.xpath("//input[@id='target']"));
	
	    Actions act = new Actions(driver);
	   
	   //char enetering
//	   act.click(textBox).sendKeys("P").perform();	
	
	   //different button
	   //back_space, shift, tab,ctrl, enter
	   //arrow-buttons
	   act.sendKeys(Keys.SHIFT).perform();
	   

	}
}

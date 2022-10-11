package Automationprogram;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//loginpage
		TakesScreenshot ts=(TakesScreenshot)driver;
	    File Source = ts.getScreenshotAs(OutputType.FILE);	
	    File myFile = new File("C:\\Users\\Deepti\\OneDrive\\Deepti chavan\\Automation Testing\\selenium\\Screenshotfile\\diptichavan1.jpg");
	    FileHandler.copy(Source, myFile);
	    
	    
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		//home page 
		TakesScreenshot ts1=(TakesScreenshot)driver;
	    File Source1 = ts1.getScreenshotAs(OutputType.FILE);	
	    File myFile1 = new File("C:\\Users\\Deepti\\OneDrive\\Deepti chavan\\Automation Testing\\selenium\\Screenshotfile\\diptichavan.jpg");
	    FileHandler.copy(Source1, myFile1);
	    System.out.println("end of program");
	}
}

package Automationprogram;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotmethod 
{
	   static WebDriver driver;
	     public static void screenshotMethod(String diptideepakchavan) throws IOException
		{
	        Date d= new Date();
	    	DateFormat d1= new SimpleDateFormat("MM-dd-yy & hh-mm-ss");
	 		String date =d1.format(d);
	 		System.out.println(date);
	 		
			TakesScreenshot ts=(TakesScreenshot)driver;
		    File Source = ts.getScreenshotAs(OutputType.FILE);	
		    File myFile = new File("C:\\Users\\Deepti\\OneDrive\\Deepti chavan\\Automation Testing\\selenium\\Screenshotfile\\screen\\" + diptideepakchavan+ date+ ".jpg");
		    FileHandler.copy(Source, myFile);
		}
	     public static void main(String[] args) throws IOException
	     {
	    	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

	 		driver = new ChromeDriver();	
	 		driver.get("https://www.saucedemo.com/");
	 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 		
	 		//loginPage
//			driver.get("https://www.saucedemo.com/");
		screenshotMethod("LOginPageSS");
//			
			
			//login
			WebElement userName = driver.findElement(By.id("user-name"));
			userName.sendKeys("standard_user");
			
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("secret_sauce");
			
			WebElement loginButton = driver.findElement(By.id("login-button"));
			loginButton.click();
			
			//homePage
			//screenshot
			screenshotMethod("HomePageSS");

	     }
}

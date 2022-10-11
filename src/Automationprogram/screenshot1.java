package Automationprogram;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot1 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		TakesScreenshot ts=(TakesScreenshot)driver;
	    File Source = ts.getScreenshotAs(OutputType.FILE);	
	    File myFile = new File("C:\\Users\\Deepti\\OneDrive\\Deepti chavan\\Automation Testing\\selenium\\Screenshotfile\\dipti1.jpg");
	    FileHandler.copy(Source, myFile);
	    System.out.println("end of program");
	}
}

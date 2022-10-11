package Automationprogram;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	public static void main(String[] args) throws IOException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		//scrensshot
		//casting
//		 int a=100;
//		 double b=(double)a;
//		
		
		TakesScreenshot Ts	=(TakesScreenshot) driver;
	
		//byte format
		File sourcefile = Ts.getScreenshotAs(OutputType.FILE);
		//screenshot -> file format-> 
        //		     -> png?, jpg?, jpeg??
		//location file-> ????
		//---------------
//		location -> yes
//		name of file-> yes
//		format of file-> yes

		File myFile = new File("C:\\Users\\Deepti\\OneDrive\\Deepti chavan\\Automation Testing\\selenium\\Screenshotfile\\dipti.jpg");
	
		FileHandler.copy(sourcefile, myFile);
	}
	
}

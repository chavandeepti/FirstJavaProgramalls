package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaseClass 
{
	   public WebDriver driver;
	  
	 
	@Parameters("browserName")
		@BeforeMethod
		public void setUp(String browserName) throws IOException
		{
		   if(browserName.equals("chrome"))
		   {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("browser is opened");
		   }
		   else
		   {
			   System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
				driver = new FirefoxDriver();
			System.out.println("browser is opened");
		   }   
			driver.manage().window().maximize();
			System.out.println("browser is maximized");
			
			driver.get("https://www.saucedemo.com/");
			System.out.println("SauceDemo URL is opened");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//take screesnhot
//		    ScreenshotClass.takeScreenshot(driver);
			
			
			//loginPage elements find +action perform
			
			LoginPOMClass x = new LoginPOMClass(driver);
			
			x.sendusername();
			System.out.println("username is entered");
			
			x.sendpassword();
			System.out.println("Password is entered");
			
			x.loginbutton();
			System.out.println("Clicked on login button");
		    
         }
					
		
		
		
		@AfterMethod
		public void tearDown()
		{
			   driver.quit();
		       System.out.println("browser is closed");
		       
		       System.out.println("end of Program");	
		}
}



package AmezonPOMTestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AmezonPOM.Screenshotclass;

public class TestclassLoginFunctionality 
{
	@Test
	public void TestclassLoginFunctionality() throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://www.Amezon.com/");
		System.out.println("Amezon URL is opened");
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

		
		LoginPageClass x= new LoginPageClass(driver);
		x.signto();
		Thread.sleep(2000);
		
		x.sendemailname();
		Thread.sleep(2000);
		
		x.sendcontiune();
		Thread.sleep(2000);
		
		x.password();
		Thread.sleep(2000);
		
		x.sendsign();
		Thread.sleep(2000);
		
		x.searchelement();
		Thread.sleep(2000);
		
		x.searchiconclick();
		Thread.sleep(2000);
		
		x.findmobiles();
		Thread.sleep(2000);
		
		x.addtocart();
		Thread.sleep(2000);
		
		
//		x.dropdownlist();
//		x.dropdownbox();
//		
		//validation
		
//		System.out.println("apply the validation");
//		String expectedTitle = "Amezon";    //dev/BA
//		
//		   String actualTitle = driver.getTitle();
//		
//		   if(expectedTitle.equals(actualTitle))
//		   {
//			   System.out.println("login functionality test case is passed");
//		   }
//		   else
//		   {
//			   System.out.println("login functionality test case is failed");
//		   }

//		   driver.quit();
//	       System.out.println("browser is closed");
//	       
//	       System.out.println("end of Program");
		
	
	}
}

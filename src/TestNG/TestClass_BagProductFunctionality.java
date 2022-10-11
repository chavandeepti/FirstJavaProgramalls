package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass_BagProductFunctionality 
{
	WebDriver driver;
	@BeforeMethod()
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("browser is opened");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		Thread.sleep(2000);
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("SauceDemo URL is opened");
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		LoginPOMClass x=new LoginPOMClass(driver);
		x.sendusername();
		Thread.sleep(2000);
		x.sendpassword();
		Thread.sleep(2000);
		x.loginbutton();
		Thread.sleep(2000);
	}

	@Test
		public void TestClass_BagProductFunctionality() throws InterruptedException 
		{
		

		//home page
		
		HomePOMClass hp=new HomePOMClass(driver);
		hp.clickBagButton();
		System.out.println("Bag product will get selected");
		Thread.sleep(2000);
			String exceptedProduct = "1";
		
		String actualProduct = hp.getTextFromAddToCart();
		System.out.println("actual product->"+actualProduct);
		
		System.out.println("apply validation");
		
		if(exceptedProduct.equals(actualProduct))
		{
			System.out.println("Bag product add to cart case is passed");
		}
		else
		{
			System.out.println("Bag product add to cart case is failed");
		}
	}
	@AfterMethod()	
	public void tearDown()
	{
		driver.quit();
	    System.out.println("browser is closed");
	       
	    System.out.println("end of Program");

	}
}

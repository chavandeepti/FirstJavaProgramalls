package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BagprodcutFUnctionality 
{
	 
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("SauceDemo URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//login activity
		LoginPOMClass l =new LoginPOMClass(driver);
		l.sendusername();
		l.sendpassword();
		l.loginbutton();
		
		//bag product
		HomePOMClass h= new HomePOMClass(driver);
		h.clickBagButton();
		
System.out.println("Bag product will get selected");
		
		//--validation--//
		String exceptedProduct = "1";
		
		String actualProduct = h.getTextFromAddToCart();
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
		
		driver.quit();
	    System.out.println("browser is closed");
	       
	    System.out.println("end of Program");

		}

		
		
	}


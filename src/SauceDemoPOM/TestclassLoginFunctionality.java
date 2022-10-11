package SauceDemoPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestclassLoginFunctionality 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("SauceDemo URL is opened");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//login page elemnts find action
		
		LoginPOMClass x= new LoginPOMClass(driver);
		x.sendusername();
		System.out.println("username is entered");
		x.sendpassword();
		System.out.println("password is entered");
		
		x.loginbutton();
		System.out.println("Clicked on login button");
		Thread.sleep(2000);
		//--homePage--
       System.out.println("apply the validation");
		
	   String expectedTitle = "Swag Labs";    //dev/BA
		
	   String actualTitle = driver.getTitle();
	
	   if(expectedTitle.equals(actualTitle))
	   {
		   System.out.println("login functionality test case is passed");
	   }
	   else
	   {
		   System.out.println("login functionality test case is failed");
	   }

	   driver.quit();
       System.out.println("browser is closed");
       
       System.out.println("end of Program");


		
	}
}

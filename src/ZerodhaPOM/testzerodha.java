package ZerodhaPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testzerodha 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://kite.zerodha.com/");
		System.out.println("zerodha URL is opened");
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		LoginZerodha x=new LoginZerodha(driver);
		x.sendusername();
		Thread.sleep(2000);
		x.sendpassword();
		Thread.sleep(2000);
		x.loginbutton();
		x.sendpin();
		Thread.sleep(2000);
		Thread.sleep(2000);
		x.continuebutton();
		
	
	
	
	
	
	
	}
}

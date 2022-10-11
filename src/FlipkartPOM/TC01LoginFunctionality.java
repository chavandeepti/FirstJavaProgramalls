package FlipkartPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC01LoginFunctionality 
{
	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser is opened");
		
		driver.manage().window().maximize();
		System.out.println("browser is maximized");
		
		driver.get("https://www.Flipkart.com/");
		System.out.println("Amezon URL is opened");
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		LoginPOMclass q= new LoginPOMclass(driver);
		q.sendlogin();
		Thread.sleep(2000);
		q.sendusername();
		Thread.sleep(2000);
		q.sendpassword();
		Thread.sleep(2000);
		q.buttonlogin();
		
		
	}
}

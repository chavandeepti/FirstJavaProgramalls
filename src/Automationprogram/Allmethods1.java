package Automationprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allmethods1 
{
 public static void main(String[] args) throws InterruptedException
  {
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//browser maximize
		driver.manage().window().maximize();
		//1.get method-use to open the url
		driver.get("https://www.facebook.com/");
				
		Thread.sleep(2000);
		//browser minimize
//	driver.manage().window().minimize();
		
		//multiple tabs-current tab-current window close
	//driver.close();
		
		//browser close-> all tabs/windows are closed
//	driver.quit();
		
	
	//getCurrentUrl
	
			String webURL = driver.getCurrentUrl();
			
			System.out.println(webURL);
			
			//get Title
			
			String webTitle = driver.getTitle();
			System.out.println(webTitle);
			
			
			
			
			System.out.println("end of program");
			


		




}
}

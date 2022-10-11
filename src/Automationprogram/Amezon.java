package Automationprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amezon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fcss%2Fhomepage.html%2Fref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		Thread.sleep(2000);
		
		WebElement email= driver.findElement(By.id("ap_email"));
		email.sendKeys("8123297611");
		Thread.sleep(2000);
				
		WebElement continue1 = driver.findElement(By.id("continue"));
		continue1.click();
		
		WebElement pass= driver.findElement(By.xpath("//input[@id='ap_password']"));
		pass.sendKeys("Deepti@18");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		login.click();
		
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("iphone 14 case");
		Thread.sleep(2000);
		
		//
		
		WebElement searchbox1=driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
		searchbox1.sendKeys("iphone 14 case");
		Thread.sleep(2000);
//
//		WebElement mobile=driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]"));
//		mobile.click();
//		Thread.sleep(2000);
		
		
		WebElement mobiledis=driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		mobiledis.click();
		Thread.sleep(2000);
		
		
		////span[@id='exportsUndeliverable-cart-announce']
		
		WebElement autocart=driver.findElement(By.xpath("//span[@id='exportsUndeliverable-cart-announce']"));
		autocart.click();
		
		
		
		
	}
}

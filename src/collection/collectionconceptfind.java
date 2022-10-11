package collection;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class collectionconceptfind 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		WebElement userName= driver.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		Thread.sleep(3000);
		
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(3000);
		
		WebElement loginButton = driver.findElement(By.id("login-button"));
		loginButton.click();
		
		//homepage
				//scenario1
//				sigle element selection

//		WebElement bagProduct = driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]"));	
//		bagProduct.click();
//		
		
		//****************
				//scenario2
				//all elements need to select at a time

		//List<Integer> x = driver.findElements(By.xpath("??"));
		
				//we will use driver.findElements method-> which will find all elemetns at a time
				//we will use a common xpath to all elments
				
		List<WebElement> allproducts= driver.findElements(By.xpath("//button[text()='Add to cart']"));
//		allproducts.click(); not possible
		
//		allproducts.get(0).click();
//		allproducts.get(1).click();
//		allproducts.get(2).click();
//		allproducts.get(3).click();
//		allproducts.get(4).click();
//		allproducts.get(5).click();

		
		//repeated code
		
		for(int i=0; i<allproducts.size(); i++)
		{
			allproducts.get(i).click();
		}
		
		System.out.println("end of program");
					

		}
		
		
		
	//assignment -> for each loop
			//for each loop -> collection concept used
//		
//		for(WebElement s:allproducts)
//		{
//			System.out.println(s);
//		}
			
	

		
		
}	
		
	


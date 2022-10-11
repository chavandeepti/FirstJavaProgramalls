package SauceDemoPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{
		//1 driver delcare
		WebDriver driver;
		
		//2 elemnet find
		@FindBy(xpath="//input[@id='user-name']")
		WebElement username;
		
		//create a method as per action on elemnt
		public void sendusername() 
		{
			username.sendKeys("standard_user");
		}
		
		@FindBy(xpath="//input[@id='password']")
		WebElement password;
		
		public void sendpassword()
		{
			password.sendKeys("secret_sauce");
		}
		
		@FindBy(xpath="//input[@id='login-button']")
		WebElement loginbutton;
		
		public void loginbutton()
		{
			loginbutton.click();
		}
		
	
		//constructor
		public LoginPOMClass(WebDriver driver)
		{
			//global 	local
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
		}
}

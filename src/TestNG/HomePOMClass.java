package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePOMClass 
{
	WebDriver driver;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement menubutton;
	
	public void clickmenubutton() 
	{
		menubutton.click();
	}
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logoutbutton;
	
	public void clicklogoutbutton()
	{
		logoutbutton.click();
	}
	public HomePOMClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//bag ele
		@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
		private WebElement bagButton;
		
		public void clickBagButton()
		{
			bagButton.click();
		}
		
		
		//addToCart ele
		@FindBy(xpath = "//a[@class='shopping_cart_link']")
		private WebElement addToCart;
		
		public String getTextFromAddToCart()
		{
			String totalProducts= addToCart.getText();
			return totalProducts;
		}

		
	
}

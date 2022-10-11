package AmezonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPageClass 
{
	//driver delcred
		WebDriver driver;
		
		//element find
		@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
		WebElement mainsign;
		public void signto()
		{
			mainsign.click();
		}
	//1 element find
		@FindBy(xpath="//input[@id='ap_email']")
		WebElement emailname;
	//method
		public void sendemailname()
		{
			emailname.sendKeys("8123297611");
		}
	//2.element find
		@FindBy(xpath="//input[@id='continue']")
		WebElement contiune;
		//method
		public void sendcontiune()
		{
			contiune.click();
		}
	//3 element find
		@FindBy(xpath="//input[@id='ap_password']")
		WebElement password;
		
		//method 
		public void password()
		{
			password.sendKeys("Deepti@18");	
		}
		
		//4 element find
		@FindBy(xpath="//input[@id='signInSubmit']")
		WebElement signclick;
		
		//method calling
		 public void sendsign()
		 {
			 signclick.click();
		 }
		 //search bar find
		 @FindBy(xpath="//input[@id='twotabsearchtextbox']")
		 private WebElement search;
		 
		 //method call
		 public void  searchelement()
		 {
			 search.sendKeys("sumsung mobiles");
		 }
		 
		 //searchclick icon 
		 @FindBy(xpath="//input[@id='nav-search-submit-button']")
		 private WebElement searchicon;
		 
		 public void searchiconclick()
		 {
			 searchicon.click();
		 }
		 
		 //mobile click
		 
		 @FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal'][1]")
		 private WebElement findmobile;
		 
		 public void findmobiles()
		 {
			 findmobile.click();
		 }
		 
		 @FindBy(xpath="//input[@id='add-to-cart-button']")
		 private WebElement cart;
		  
		 public void addtocart()
		 {
			 cart.click(); 
		 }
		 
		 @FindBy(xpath="//div[@class='nav-search-scope nav-sprite']")
		 private WebElement dropdown;
		 
		 public void dropdownlist()
		 {
			 dropdown.click();
		 }
		 
		 @FindBy(xpath="//select[@id='searchDropdownBox']")
		 WebElement dropdownbox;
		 
		 public void dropdownbox()
		 {
			 
			 Select s = new Select(dropdownbox);
			 s.selectByValue("search-alias=stripbooks-intl-ship");
		 }
		 //create constructor
		  public LoginPageClass(WebDriver driver)
		  {
			  this.driver=driver;
			  PageFactory.initElements(driver,this);
		  }
		  
		  //ad to cart
		  
		  
}


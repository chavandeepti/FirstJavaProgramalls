package TestNG;
import org.testng.annotations.Test;



public class SoftAssert 
{
	@Test
	public void logintest()
	{
		String expectedTitle="swag labs";
		String actualTitle="labs";
		 
		SoftAssert soft=new SoftAssert();
		
		soft.assertEquals(actualTitle, expectedTitle);
		soft.assertAll();
	}

	private void assertAll() {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(String actualTitle, String expectedTitle) {
		// TODO Auto-generated method stub
		
	}
}

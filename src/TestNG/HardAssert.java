package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert 
{
	@Test
	public void loginTest()
	{
		String expectedTitle="swag labs";
		String actualTitle="swag";
		//hard assert
		//Assert class
		//Assert class-.static method use

		Assert.assertEquals(actualTitle, expectedTitle,"Failure due title mismatch"	);
		
	}
}

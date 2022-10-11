package TestNG;

import org.testng.annotations.Test;

public class InvocationCountKeyword 
{
	@Test(invocationCount=5)
	public void testA()
	{
		System.out.println("testA");
	}
	@Test(priority=1,invocationCount=3)
	public void testB()
	{
		System.out.println("testB");
	}
	@Test()
	public void testC()
	{
		System.out.println("testC");
	}
	@Test(priority=-3,invocationCount=0)
	public void testD()
	{
		System.out.println("testD");
	}
	@Test(invocationCount=-1)
	public void testE()
	{
		System.out.println("testE");
	}
	
}

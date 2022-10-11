package casting;

public class impclass implements Interface1
{

	@Override
	public void method1() 
	{
		System.out.println("method1");
	}

	@Override
	public void method2() 
	{
		System.out.println("method2");
	}
	public void method3()
	{
		System.out.println("method3-imp class");
	}
	
	public void method4()
	{
		System.out.println("method4-imp class");
	}
	public static void main(String[] args) 
	{
		//upcasting
		Interface1 x = new impclass();
		x.method1();  //possible
		x.method2();  //possible
		 
//		x.method3();  //not possible
//		x.method4();  //not possible
		
	}


}

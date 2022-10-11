package thirdpackage;

public class classA 
{
	//satic varibale
	protected static int a=100;
	
	protected int b = 200;
	
	//static
	protected static void method1()
	{
		System.out.println("class-A-static method1");
	}
	//non static
	protected void method2()
	{
		System.out.println("class-A-non-static method2");
	}

	//main
		public static void main(String[] args) 
		{
			System.out.println(a);
			method1();
			classA x = new classA();
			System.out.println(x.b);
			x.method2();
			
		}

}

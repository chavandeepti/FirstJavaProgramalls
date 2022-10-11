package Constructor;

public class Constructor2 
{
	public Constructor2()
	{
		//1 const.
		int x = 10;
		System.out.println(x);
		int y = 20;
		System.out.println(y);
				
	}
	
	// static method
	
	public static void method1()
	{
		System.out.println("method-STATIC");
	}
	
	// non static method
	
	public void method2()
	{
		System.out.println("non static method");
	}
	
	public static void main(String[] args)
	{
		//Constructor2(); // not possible
		//1 //const call-->object call--object syntax
		Constructor2 xyz=new Constructor2();
		
		//2 static method calling
		method1();
		
		//3.non static method calling
//		with object
//		objectName.MethodName
		xyz.method2();
	}

 
}

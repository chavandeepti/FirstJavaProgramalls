package NewPackage;

public class class1 
{
	//satic varlible
	public static int a=10;
	public static void method1()
	{
		System.out.println("static method");
		//System.out.println(a);
	}
	//non- satic varible
	public int b =20;
	public void method2()
	{
		System.out.println("non- satic method");
		//System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		//dirctly call static method
		method1();
		
		//static var
		System.out.println(a);
		
		//object create
		class1 x=new class1();
		
		//non satic varible
		x.method2();
		
		//non satic var
		System.out.println(x.b);
		
	}
}

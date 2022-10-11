package Constructor;

public class DefaultConstructor 
{
	//1.DefaultConstructor 
//	int a=100;
//	int b=200;
//	
//	
//	public static void main(String[] args) 
//	{
//		//object creation  // A default constructor is called or system defined constructor
//		DefaultConstructor x=new DefaultConstructor();
//		 System.out.println(x.a);
//		 System.out.println(x.b);		
//	}
	
	//2 . non static method using default constructor
	public void method1()
	{	
		int a=100;
		int b=200;
		int c=a+b;
		System.out.println("method - "+c);
		
	}
	public static void main(String[] args) 
	{
		//object creation // A default constructor is called or system defined constructor
		DefaultConstructor x=new DefaultConstructor();
		//non static method call
    	x.method1();
		
	}
}


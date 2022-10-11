package Constructor;

public class parametrizedconstructor
{
	//1. user defined constructor/ parametirized
//	public parametrizedconstructor()
//	{
//	System.out.println("parametrizedconstructor and I m present here");
//	}
	
	
	// 2. with parametrized constructor
	public parametrizedconstructor(int i, int j)
	{
		int a=200;
		int b=200;
		int c=a+b;
		System.out.println("constructor with two parameters  " +c);
	}
	
	
	//3 without parametrized constructor
	public parametrizedconstructor()
	{
		char a='x';
		System.out.println("without parametrized constructor "+a);
	}
	//non static method
		public void method1()
		{
			System.out.println("Non static method");
		}

	public static void main(String[] args) 
	{
		//object create// passing with argument values
        parametrizedconstructor x= new parametrizedconstructor(12,20);
        // non static method calling
        x.method1();
        //without argument 
		new parametrizedconstructor();
		
		
	}

}

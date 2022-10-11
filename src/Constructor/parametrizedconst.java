package Constructor;

import java.nio.file.ReadOnlyFileSystemException;

public class parametrizedconst 
{
	int a;
	
	// 1.const without argument
	public parametrizedconst()
	{
		 a=100;
		System.out.println("const without argument-"+a);
	}
	
	//2.Const with argument
	public  parametrizedconst(int q)
	{
		 a=200;
		System.out.println("const with argument-"+a);
		
	}
	
	//3.const with argumnet double parameter passed
	public parametrizedconst(int x, int y)
	{
		a=300;
		System.out.println("const with argumnet double parameter" +a);
	}
	
	// non static method-creation
	public void method1()
	{
//		System.out.println("this is non static method-method1");
	}


	public static void main(String[] args) 
	{
		////1.object create with first const -without argument
		parametrizedconst s=new parametrizedconst();
		s.method1();
		
		//2.object create with second const-with argument- passed one parrametr
		parametrizedconst r=new parametrizedconst(1000);
		r.method1();
		
		//3.object create with third const- with argument- passed two parameter
		parametrizedconst t=new parametrizedconst(1000,2000);
		t.method1();
	}
}

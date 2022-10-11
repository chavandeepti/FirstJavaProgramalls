package secondPackage;

import NewPackage.class1;

public class class3 
{
	public static void main(String[] args) 
	{
		// static method  dircelty call here. then it will be add class1-and . drclty added by import 
		
		class1.method1();
		
		// satic var
		System.out.println(class1.a);
		
		// non satic alwys create obejct
		 class1 y= new class1();
		 y.method2();
		 
		 //non satic var
		 System.out.println(y.b);
	}

}

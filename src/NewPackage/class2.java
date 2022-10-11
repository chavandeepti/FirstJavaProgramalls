package NewPackage;

public class class2 
{
	//dont create new things its allready class
	//main 
	public static void main(String[] args) 
	{
		// satic - dieclty call here
		class1.method1();
		// satic var
		System.out.println(class1.a);
		
		// non static - alwys create object
		class1 R =new class1();
		R.method2();
		
		//non satic var
		System.out.println(R.b);
	}

}

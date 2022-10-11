package thirdpackage;

public class classB

{
	public static void main(String[] args) 
	{
		System.out.println(classA.a);
		classA.method1();
        
		classA x = new classA();
		System.out.println(x.b);
        x.method2();
	}

}

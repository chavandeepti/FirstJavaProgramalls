package Interface;

public interface Velocityinterface 
{
	//complet method not possible
//	public void method1()
//	{
//		System.out.println("hii");
//	}
	
	//incomplete possible
	void method2();
	
	//non static complete-not possible
//	public void method3()
//	{
//		System.out.println("hello");
//	}
	
	//complete static->Yes
		public static void method4()
		{
			System.out.println("complete-static-interface");
		}
		
		//incompelte static method->not possible
        //public static void method5();
		
		//main
	public static void main(String[] args)
	{
		//calling->// not possible
		//method1();
		
		//object
//		Velocityinterface x=new Velocityinterface();
//		x.method2(); // not possible
		
	//	method3(); not possible
		
		
		
		method4();// possible
		
		//method5(); //not possible
		
		
	}
}

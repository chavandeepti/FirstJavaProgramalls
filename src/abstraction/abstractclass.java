package abstraction;

public abstract class abstractclass 
{
	// normal complete non static method possible - we can write
	public void method1()
	{
		System.out.println("normal method1-complete-non static");
	
	}
	//incomplete non static method-possible-->we can write
	public abstract void method2();
	
	//abstract method --> in abstract class only
		// not in normal class
	
	// incomplte static method-not possible
	//public abstract static method3();
	


	// complte static method-possible
		public static void method4()
		{
			System.out.println("complete static");
		}

		//main method
	public static void main(String[] args) 
	{
		//not possible
		//	AbstractClass x = new AbstractClass();
		//we cant create the object of abstract class
		//method1 calling-not possible
		
		// calling
		//non static incomplete method --> not possible
		
		// calling
		//complete non static method ->not possible
			
		// calling
		//complte static method-->possible
		method4();
		

	}
}

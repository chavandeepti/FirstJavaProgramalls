package Constructor;

public class Assignmentconst 
{
		int a;
		public static void method1()
		{
			System.out.println("method-STATIC");
		}
	
			// 2. non static method
		public void method2()
		{
			System.out.println("non static method");
		}
		
		// 3.with argument
		
		public static void method3(int x)
		{
			int a =100;
			System.out.println("value of a is- "+a);
		}
		
		// 4. without argument
		
		public static void method4()
		{
			int a=100;
			System.out.println(a);
		}
		
		// 5.with return type
		
		public static int addmethod()
		{
			int x=10;
			int y=20;
			int z=x+y;
			System.out.println(z);
			return z;	
		}
		
		//6. without  return type
		public static void addmethod1()
		{
			int x=100;
			int y=200;
			int z=x+y;
			System.out.println(z);
			
		}
		
		
		public static void main(String[] args) 
		{
			method1();
//			method2(); // void keyword not return anything
			method3(20);
			method4();
			addmethod();
			addmethod1();
			
			
		}
}

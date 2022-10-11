package Constructor;

public class objectcreate 
{
		public objectcreate(int r, int s)
		{
			int a=100;
			System.out.println("object "+ a); 
		}
		
		// static 
		public static void method()
		{
			int a=10;
			int b=20;
			int c=a+b;
			System.out.println("value of  "+c);
		}
		
		
		public static void main(String[] args) 
		{
			// obeject creation
			objectcreate x=new objectcreate(10,20);
			x.method();
		}
}

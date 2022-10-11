package Interface;

public interface deafult
{
		// complete method-not possible
//		public void method1()
//		{
//			System.out.println("complete method");
//		}
	
		// default method-complete methods in interface
		// possible with deafult keyword
		public default void method1()
		{
			System.out.println("complete method- interface");
		}
		
		public static void main(String[] args) 
		{
			// not possible 
			//method1();
			
			//deafult x=new deafult();
			//x.method1();
		}
}

package Strings;

public class stringprogram1 
{
	public static void main(String[] args) 
	{
		//literal string
//		String x="Deepti";
//     	System.out.println(x);
//     	
     	//new keyword
//     	String b = new String("welcome");
//     	System.out.println(b);
     	
     	//Syntax discussion
     	
     	//String with literal
		
//		String a = "Apple";
//		System.out.println(a);
//		
//		String b = "Mango";
//		System.out.println("b");
		
		//value checking
//		//equals method
//		
//		boolean result = a.equals(b);
//		System.out.println(result);
		
		//address check
////	== operator
//	
//        boolean result1 = a == b;
//       System.out.println(result1);
		
		
		//.equals -> value check
		//== operator -> address check
		
		String a = "Apple";
		String b = "Mango";
		String c = "Apple";
		String d = "apple";
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);
		
		//value checking
	boolean result = a.equals(b);
	
	System.out.println(a.equals(b)); //F
	System.out.println(a.equals(c)); //T
	System.out.println(a.equals(d)); //F


		
		





	}
}

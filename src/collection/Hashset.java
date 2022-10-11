package collection;

import java.util.HashSet;
import java.util.Iterator;
public class Hashset 
{
	public static void main(String[] args) 
	{
//		HashSet x= new HashSet();
//		x.add(10);
//		x.add('h');
//		x.add("rha");
//		x.add(25.32);
//		System.out.println(x);
//		System.out.println(x.size());
		
		//index concept not followed
		//we cant use the index related methods

//		x.get(0);   not possible this method using hashset
//		x.set(0,11);
		
		
		// Iterator interface
		
//		 Iterator z = x.iterator();
		 
//		 System.out.println(z.next());
//		 System.out.println(z.next());
//		 System.out.println(z.next());
//		 System.out.println(z.next());
//		 System.out.println(z.next());
//		 System.out.println(z.next());
//		 System.out.println(z.next());
//		
		 
//		 System.out.println("size->"+x.size());
//
//		for(int i=1; i<=x.size();i++) 
//		{
//			System.out.println(z.next());
//		}
		
	HashSet<Integer> HS=new HashSet<Integer>();
	 HS.add(4);  
	 HS.add(8);  
	 HS.add(5);  
	 HS.add(6); 
	 HS.add(9);
	  System.out.println( HS);
	  System.out.println(HS.size());
	  
	  Iterator Y = HS.iterator();
		 
//	 System.out.println(Y.next());
//	 System.out.println(Y.next());
//	 System.out.println(Y.next());
//	 System.out.println(Y.next());
//	 System.out.println(Y.next());
////	 System.out.println(Y.next());
////	 System.out.println(Y.next());
	 
	 System.out.println("size->"+HS.size());
	
	 for (int i=1; i<=HS.size();i++)
	 {
		 System.out.println(Y.next());
	 }
	
	
	}
}

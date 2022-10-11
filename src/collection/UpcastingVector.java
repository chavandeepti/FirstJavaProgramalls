package collection;


import java.util.List;
import java.util.Vector;

public class UpcastingVector 
{
	public static void main(String[] args) 
	{
	    List z = new Vector();
		
//					z.add(10);
//					z.add(20);
//					z.add(30);
//					z.add('A');
//					z.add("RAHUL");
//					z.add(1.11);
					
//					System.out.println(z);
					
//					System.out.println(z.get(0));
//					
//					z.set(0, 12);
//					System.out.println(z);
//					
//					z.remove(0);
//					System.out.println(z);
//					
//					int listEleSize = z.size();
//					System.out.println(listEleSize);
					
					// specific syntax
//				List<Integer> Y=new Vector<Integer>();
					
//				Y.add(12);  
//			    Y.add(35);
//			    Y.add(36);
//			    Y.add(2);
//			    Y.add(5);
//			    System.out.println(Y);
			    
//			    Y.add("Dog");   // Not possible
//			    Y.add("Elephant"); 
			    
			    
//			    Y.set(0, 15);
//				System.out.println(Y);
//				
//				Y.remove(0);
//				System.out.println(Y);
//				
//				int listEleSize1 = Y.size();
//				System.out.println(listEleSize1);
//				
				List<String> A=new Vector<String>();
				A.add("abcd");  
			    A.add("asdgd");
			    System.out.println(A);
	}
}

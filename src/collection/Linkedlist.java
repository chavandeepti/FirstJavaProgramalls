package collection;

import java.util.LinkedList;

public class Linkedlist 
{
	public static void main(String[] args) 
	{
		//genralized sysyntx
		LinkedList x= new LinkedList();
		
//		x.add(10);
//		x.add('a');
//		x.add("abc");
//		x.add(1.2);
//		System.out.println(x);
		
		//get
//		System.out.println(x.get(0));
//		System.out.println(x.get(1));
//		System.out.println(x.get(2));
//		System.out.println(x.get(3));
//		
		//remove
		//set
		//szie
		//add

		//specific sysnatx
		
		LinkedList<Integer> Y= new LinkedList<Integer>();
		Y.add(1);
		Y.add(20);
		Y.add(58);
		Y.add(36);
	//	Y.add("abcd"); //not possible only integer	
		
		
		
//		Y.add(111);
//		System.out.println(Y);
//		//size
//		System.out.println(Y.size());
//		//remove
//		Y.remove(1);
//		System.out.println(Y);
//		//replace
//		Y.set(1, 56);
//		System.out.println(Y);
//		//indiviual method-get
//		System.out.println(Y.get(0));
//		System.out.println(Y.get(1));
//		System.out.println(Y.get(2));
		
		LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay"); 
		  System.out.println(al);
	}
	
}

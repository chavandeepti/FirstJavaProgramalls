package collection;

import java.util.ArrayList;

public class Arraylist
{

	public static void main(String[] args) 
	{
//		int a=100;
//		int b=200;
//		
//		int c []= {10,20,30,40,50};
		
		// collection concept
		// array list
		
//		ArrayList a= new ArrayList();
		
		//add method
//		
//		a.add(10);
//		a.add(20);
//		a.add(30);
//		a.add(40);
//		a.add(60);
//		a.add(82);
		
//		System.out.println(a);
		
//		a.add('A');
//		a.add("deepti");
//		a.add(22.56);
//		
//		System.out.println(a);
//		
	//	[10, 20, 30, 40, A, deepti, 22.56]
//	index 0   1   2   3   4   5       6	
		
		//print indiuval
		//get method + index pass
		
//		System.out.println(a.get(0));
//		System.out.println(a.get(1));
//		System.out.println(a.get(2));
//		System.out.println(a.get(3));
//		
		//element size method
//		System.out.println("elemnts of array->"+a.size());
		
		// strat index 0
		// end index 3->size -1
//		
//		for(int i=0;i<a.size();i++)
//		{
//			System.out.println(a.get(i));
//		}
		
		//ele add -> add
//		//ele print -> object print statement
//		//single el -> get("idex")
//        //arraylist size -> size 
		
		//remove method
		
//		a.remove(3);
//		System.out.println(a);
//		System.out.println(a.size());
		
		// replace 20 to 100
//		a.set(1,100);
//		System.out.println(a);
//		
		//method
//		//add
//		//get
//		//size
//		//remove
//		//set
//		//additional 2-3 method learn

		
		//arraylist concept syntax- genralized sysntx
		
//		ArrayList x=new ArrayList();
		
		//specific sysntx
		
		ArrayList<String> x=new ArrayList<String>();
		
		x.add("deepti");
		x.add("shilpa");
		x.add("xyz");
		
		System.out.println(x);
		
//		x.add(10);  not possible
//		x.add('a');
//		x.add(2.25);
		
		
		//add
		x.add("vinayak");
		System.out.println(x);
		//size
		System.out.println(x.size());
		//remove
		x.remove(1);
		System.out.println(x);
		//replace
		x.set(1, "mane");
		System.out.println(x);
		//indiviual method-get
		System.out.println(x.get(0));
		System.out.println(x.get(1));
		System.out.println(x.get(2));
		
//		ArrayList<Integer> Y=new ArrayList<Integer>();
//		Y.add(45);    // integer accptble
//		Y.add(2.235); //not accptable bcz-it is decimal
//		Y.add("deepti");// string not 
		
		ArrayList<Double> Y=new ArrayList<Double>();
				
	}
}

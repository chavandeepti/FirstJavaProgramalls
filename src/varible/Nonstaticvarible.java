package varible;

public class Nonstaticvarible 
{
	////default values
	int a;		//global-nonstatic
	int c;       //global-nonstatic
    double d;    //global-nonstatic
    
    public static void main(String[] args) 
    {
	
    	
    	//non static calling
//   	 System.out.println(a);   //not possible 
   //	 System.out.println(Nonstaticvarible.a); ////not possible
    	
    	// create object then
    	Nonstaticvarible x=new Nonstaticvarible();
    	
    	// deafult values
    	 System.out.println("a-"+x.a);
    	 System.out.println("c-"+x.c);
    	 System.out.println("d-"+x.d);

    	
	}

}

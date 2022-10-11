package Superkeyword;

public class child extends parent
{
	public child(int a)
	{
		//child class const always calls parent class const
				//with the help of super keyword
				//its not a inheritance
				//its just a invoke process
				
				super();		
				System.out.println("This is child class constructor");
	}
	public static void main(String[] args) 
	{
		//we cant inherit the constructor at all
	}	
		public static void main(String[] args) 
		{
			child x = new child(10);
			
		}
		
		//inheritance
		//method -> Yes
		//var    ->Yes
		//const  ->No
		
		//Const --> invoke --> super()

	
}

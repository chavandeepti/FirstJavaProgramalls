package MainConcepts;

public class staticnonstaticmethods
{
	public static void addtion()
	{
		// static method
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	//non static method
	public void addition1()   // void not rteun anything
	{
		int x=10;
		int y=20;
		int z=x+y;
		System.out.println(z);
	}
	public static void main(String[] args)
	{
        addtion();
//		addition1();  //void not retrun anything
	}
}

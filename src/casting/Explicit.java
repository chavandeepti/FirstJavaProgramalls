package casting;

public class Explicit
{
	public static void main(String[] args) 
	{
		double a=10.44; //8 byte
		System.out.println(a);
		
		int b= (int)a;
		System.out.println(b);
	}
}

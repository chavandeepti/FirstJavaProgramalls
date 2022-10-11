package methodoverriding;

public class over extends methodoverriding
{
	public void method()
	{
		System.out.println("non static method");
	}
	public static void main(String[] args) 
	{
		methodoverriding z=new methodoverriding();
		z.method();
		
	}
}
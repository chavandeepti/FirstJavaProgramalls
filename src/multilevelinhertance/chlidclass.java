package multilevelinhertance;

public class chlidclass extends parentclass 
{
	public static void main(String[] args) 
	{
		chlidclass y=new chlidclass();
		y.method();
		System.out.println(y.a);
	}
}
// granparentclass to parentclass- this is the single inhertance
//grandparentclass to childclass- this is the single inhertance
//gradparentclass to parentclass to childclass - this is the multilvel inheritance
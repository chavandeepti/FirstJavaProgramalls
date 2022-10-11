package Superkeyword;
				//childclaa				//parentclass
public class superkeyword1 extends superkeyword
{
		String x="chavan";
		
		public void printname()
		{
			//child class global var
			System.out.println(x);
			
			//parent class global var
			System.out.println(super.x);
		}
		public static void main(String[] args) 
		{
			superkeyword1 z=new superkeyword1();
			{
				z.printname();
			}
		}
}

package ThisKeyword;

public class thiskeyword
{
//	int studentmarks;
//	
//	public thiskeyword()
//	{
//		studentmarks=90;
//		System.out.println("student marks->"+studentmarks);
//	}	
//		public static void main(String[] args)
//		{
//			thiskeyword x= new thiskeyword();
//					
//		}
//		**********************
//		global var --> studentMarks
//		local var  --> a
		
//	    int studentMarks;
//		
//		public thiskeyword(int a)
//		{
//			studentMarks = a;
//			System.out.println("Student Marks are->"+studentMarks);
//		}
//		
//		public static void main(String[] args) 
//		{
//			thiskeyword x = new thiskeyword(90);
//		}
	
//	***********************
	//global var --> studentMarks
			//local var  --> a
			
		    int studentMarks;
			
			public thiskeyword(int studentMarks)
			{
				 //global           //local
				this.studentMarks = studentMarks;
				System.out.println("Student Marks are->"+this.studentMarks);
			}
			
			public static void main(String[] args) 
			{
				thiskeyword x = new thiskeyword(90);
			}


		
		


}

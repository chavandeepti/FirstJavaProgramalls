package firstpackage;

public class NestedIfstatement {
	public static void main(String[] args) {
		
		int age =15;
		int wieght=50;
		 if(age>=18) {
			 System.out.println("eligible for blood donation and check fot weight");
			 if(wieght>=60)
			 {
				 System.out.println("completely eligible for blood");
			 }
			 else
			 {
				System.out.println("not eligible due to weight criteria");
					}
				}
				
				else
				{
					System.out.println("not eligible for blood donation due to age criteria");
				}

	 
			 
		 }
		
	}



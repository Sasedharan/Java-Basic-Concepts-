import java.util.Scanner;

public class inputdemo {

	public static void main(String args[]) {
		
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the Name");
			
			String name = in.nextLine();
			
			System.out.println(" Enter the age");
			
			int age = in.nextInt();
			
			System.out.println(" Enter the email");
			in.nextLine();
			
			String email = in.nextLine();
			
			System.out.println("Enter the cgpa");
			
		    float decimal = in.nextFloat();
		    
			System.out.println("The age is" + age);
			System.out.println("The Name is"+ name);
			System.out.println("Your Mail id is " + email);
			System.out.println("Your Mail id is " + decimal);
			
			
		}
	    
	  
	    
	    
		
		
	}
}

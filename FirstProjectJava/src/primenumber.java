import java.lang.Math;
import java.util.Scanner;
public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int value=scanner.nextInt();
		
		int number = (int)Math.sqrt(value);
				
	//	System.out.println(number);
		for(int i=2;i<=number;i++)
		
		{
			if(value%i==0)
			{
				System.out.println(" The Value is not a Prime Number");
				break;
			}
			
			else
		{
				System.out.println("The enter number "+ value + "is an prime number");
				break;
		}
		}
	    
	}

}

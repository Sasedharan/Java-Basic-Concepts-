import java.util.Scanner;

public class booleanoperator {

	public static void main(String[] args) {
	
		Scanner Mark = new Scanner(System.in);
		System.out.println("Enter the Mark ");
		int submark = Mark.nextInt();
		
		if(submark>=90)
			System.out.println("A Grade");
		else if(submark>=80)
			
			System.out.println("B Grade");
		else if(submark>=70)
			System.out.println("c Grade");
		else if(submark>=60)
			System.out.println("D Grade");
		else
			System.out.println("E Grade");
		
		System.out.println("Enter the Operators : ");
		char operator = Mark.next().charAt(0);
		
		System.out.println("The Operator is :" + operator);
	}

}

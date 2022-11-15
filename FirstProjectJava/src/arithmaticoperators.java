import java.util.Scanner;

public class arithmaticoperators {

	public static void main(String[] args) {
		
		
	Scanner input = new Scanner(System.in);
		System.out.println("Enter the First value ");
		int a = input.nextInt();
		System.out.println("Enter the Second value ");
		int b = input.nextInt();
		int c;
		c = a +b;
		System.out.println("The Addition of two number is " + c);
		c=a/b;
		System.out.println("The Division of two number is " + c);
		c=a*b;
		System.out.println("The multiplication of two number is " + c);
		c=a%b;
		System.out.println("The Reminder of two number is " + c);
		a+=100;
		System.out.println("The Addition using compound operator is " + a); 

	/*	int x=3,y=4,z;
		z=x+y + x++ + y++ + ++x + ++y;
		System.out.println(z);  */
	}

}

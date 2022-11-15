package Basics;

import java.util.Scanner;

public class Conditionalmethods {
	public static void main(String[] args)
	{
		int a=90,b=54;
		
	//	Scanner obj = new Scanner(System.in);

		 System.out.println(" Finding the Largest Number among the Given No's");
	//	 System.out.println("Enter the 3 Number ");
//		int a = obj.nextInt();
//		int b = obj.nextInt();
//		int c = obj.nextInt();
		 
		 
		 String largest = (a>b)?" A is Greater":"B is Greater";
		 System.out.println(largest);
		 
		 
/*		 if(a>b)
		 {
			 if(a>c)
			 {
				 System.out.println("The Largest Number is a : " +a);
			 }
			 else if(b>c)
			 {
				 System.out.println(" The Largest Number is b :" +b);
			 }
			 
			 else
			 {
				 System.out.println(" The Largest Number is c : "+c);
			 }
		 } */
	}

}

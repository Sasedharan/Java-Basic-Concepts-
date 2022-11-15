package Basics;

import java.util.Scanner;

public class Inputoutputmethod {
	public static void main(String[] args)
	{
		Scanner inputobj = new Scanner(System.in);
		
		
		System.out.println("Enter the Name and the roll no");
		
		String 	Name = inputobj.nextLine();
		
		int rollno = inputobj.nextInt();
		
		float decimal = inputobj.nextFloat();
		
		System.out.println("Your Name is " + Name +"\nthe roll no is :" +rollno + " \nthe float value is :" + decimal);
		
	}

}

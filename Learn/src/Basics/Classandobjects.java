package Basics;

public class Classandobjects {
	int a=10;
	public static void main(String[] args)
	{
		//multiply(21,56);
		System.out.println(multiply(45,67));
		name("Hello");
	}

	static int multiply(int a, int b)
	{
		int mult = a*b;
		//System.out.println(mult);
		return mult;
	}
	static void name(String a)
	{
	
		System.out.println(a);
	}
}

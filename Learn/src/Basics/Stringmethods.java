package Basics;

public class Stringmethods {
	public static void main(String[] args)
	{
		String Word = " Hi! Here we go to learn JAVA";
		//int a= Word.length();
		System.out.println("The Number of Character in the String is : " + Word.length());
		System.out.println(Word.toUpperCase());
		System.out.println(Word.toLowerCase());
		System.out.println(Word.indexOf("H"));
		
		
		String msg1 = " Hi ";
		String msg2 = ", Good Morning. Have a \"nice\" day";
		System.out.println(msg1+msg2);
		
		System.out.println(msg1.concat(msg2));
				
	}

}

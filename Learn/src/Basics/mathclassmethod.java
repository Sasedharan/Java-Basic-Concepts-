package Basics;

public class mathclassmethod {

	public static void main(String[] args)
	{
		int value1=20;
	    int value2=98;
		int maximum = Math.max(value1,value2);
		float roundvalue = Math.round(56.92);
		int roundvalue2 = (int) roundvalue;
		
		int absolutevalue = Math.abs(-56);
		double randomvalue =(Math.random() * 10);
		int randomalue2 =(int) randomvalue;
		System.out.println(maximum);
		System.out.println(roundvalue);
		System.out.println(roundvalue2);
		System.out.println(absolutevalue);
		System.out.println(randomvalue);
		System.out.println(randomalue2);
	} 
}
 
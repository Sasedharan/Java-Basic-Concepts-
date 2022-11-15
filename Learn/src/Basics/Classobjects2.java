package Basics;

public class Classobjects2 {
	
	int number =10;
	String Word = "Vanakkam da Mapla...!";
	
	public static void main(String[] args)
	{
		Classobjects2 call = new Classobjects2();
		System.out.println(call.number);
		System.out.println(call.Word);
		
	    call.number = 30;
	    call.Word = "Thenila irunthuu....";
		System.out.println(call.number);
		System.out.println(call.Word);
		
	}

}

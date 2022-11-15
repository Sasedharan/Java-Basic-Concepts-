package Basics;

public class Inheritance {
	public String Word = " Ada Setha Payalaa...!";
	public void message()
	{
	System.out.println(" Nee oru Artist nu nurubichitadaa");
	}

}
class child extends Inheritance
{
	public String Letter = " Ah Nakkuuu.. Sethapayluvalaa...!";

public static void main(String[] args)
{
	child parent = new child();
	parent.message();
	System.out.println(parent.Word);
	//System.out.println(message());s
	
}
}

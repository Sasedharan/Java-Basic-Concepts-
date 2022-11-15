package ArrayImplementaion;

import java.util.Scanner;
class Darray
{
	int size = 0;
	int[] a;
	
	public void insertion(int value)
	{
		if(size==a.length)
			System.out.println(" The Array is Full");
		a[size++]=value;
			
	}
	
	public void dis(int[] a)
	{
		for(int i=0;i<size;i++)
		System.out.println("The Array Elements are:"+ a[size] +" ");
		
	}
}

public class DynamicArray {
	
	public static void main(String[] args)

	{
		Darray obj1 = new Darray();
		Scanner input = new Scanner(System.in);
		
		while(true)
		
		System.out.println("1.Insert the Element at the End:");
		System.out.println("2.Display the list of elements:");
		System.out.println("3.Insert the element at the nth position:");
		System.out.println("4.Delete the element at the nth position:");
		System.out.println("5:Exit:");
		System.out.println("\n1..........................................:");

		System.out.println(" Enter Your Choice");
		
		int choise =input.nextInt();
		
		switch(choise) {
		case 1 : 
			System.out.println("Enter the value to insert as element");
		    int value=input.nextInt();
		    obj1.insertion(value);
		    break;
		case 2:
		//	obj1.dis(a);
			break;
		case 3:
			System.out.println("Enter the element to insert");
			int vale=input.nextInt();
			System.out.println("Enter the position to insert");
			int positionposition=input.nextInt();
			//obj1.insertion(vale,position);
			break;
		case 4:
			System.out.println(" Enter the positon to delete the element");
			int pos=input.nextInt();
		//	obj1.deleteposition(pos);
		    break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Wrong Entry");
			
		}
			
			
		    
		
	}

}

import java.util.Scanner;

public class foreachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] array = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Elements in array");
		
		for(int i=0;i<array.length;i++)
		   array[i]=scanner.nextInt();
		
		System.out.println("Print the array using Foreach Loop condition");
		for(int x: array)
		{
			System.out.println(x);
		    sum +=x;
		}
		System.out.println("The Sum of the elements is : " + sum);
	}

}

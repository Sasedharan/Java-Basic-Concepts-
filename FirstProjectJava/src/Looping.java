
import java.util.Scanner;
public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number of terms :");
		int number=scanner.nextInt();
		
		int i,j;

		for(i=1;i<=number;i++)	
		{
			for(j=1;j<=5;j++)
			{
				if(i == 2 && j>=2 || i==3 && j>=4 || i==4 && j>=2)
					continue;
				System.out.print("*");
			}
			System.out.println("\n");
		}

	}

}

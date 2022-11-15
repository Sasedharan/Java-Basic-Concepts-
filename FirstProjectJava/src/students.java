import java.util.Scanner;

public class students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int marks[] = new int[5];
		Scanner scanner = new Scanner(System.in);
		studentDetails student1 = new studentDetails();
		studentDetails student2 = new studentDetails();
		studentDetails student3 = new studentDetails();
//		System.out.println("Enter the name of the student and roll no: ");
//		student1.name =scanner.nextLine();
//		student1.rollno=scanner.nextInt();
//		System.out.println("Enter the 5 subjects marks to calculate total:");
//		for(int i=0;i<marks.length;i++)
//		{
//			student1.marks[i]=scanner.nextInt();
//		}
//		
//		
//		System.out.println("Name of the Student : " +student1.name);
//		System.out.println("Roll No             : " +student1.rollno);
//		
//		System.out.println(" The Total Marks is : " +student1.totalmarks());
//	
		student2.name = "Sanmath";
		student2.rollno = 897;
		student2.marks[0]=85;student2.marks[1]=78;student2.marks[2]=55;student2.marks[3]=84;student2.marks[4]=65;
		System.out.println(" The Name of the student is :" + (student2.name = "Sanmath"));
		System.out.println(" The Roll no is :" + (student2.rollno = 897));
		System.out.println(" The Total mark is :" + student2.totalmarks());
		
		
	}
}

class studentDetails{
	String name;
	int rollno;
	int[] marks = new int[5];
 	int totalmarks(){
 		int t=0;
		for(int i=0;i<marks.length;i++)
		{
		  t = t+marks[i];
		}
		return t;
	}
}
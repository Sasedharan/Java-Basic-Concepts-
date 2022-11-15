
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
       studentDetails student1=new studentDetails("sasi",89,469);
       
       System.out.println("The Total marks is :" + student1.totalmarks());
       
	}

}
class studentDetails
{
	String name;
	int rollno;
	int marks;
	
	studentDetails(String n,int r,int m)
	{
		
		name=n;
		rollno=r;
		marks = m;
	
	}
 	int totalmarks(){
 	
		return marks;
	}
}
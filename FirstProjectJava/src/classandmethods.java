


public class classandmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        memberDetails member1 = new memberDetails();
//        memberDetails member2 = new memberDetails();
//        
//        member1.name = " Ragunathan";
//        member2.name =" Selvakuamr";
//        
//        System.out.println(member1.name);
//        System.out.println(member1.addressIdProof);
//        System.out.println(member2.name);
        
        box glassBox = new box();
        glassBox.length = 8;
        glassBox.breadth = 4;
        glassBox.height = 2;
        int sArea= glassBox.surfaceArea();
       System.out.println("The Surface Area of the cuboid is :" + sArea);
        
	}

}

class box{
	int length;
	int breadth;
	int height;
   
	
    int surfaceArea()

	{
		return 2*(length*breadth + breadth*height + length*height);
	}





class memberDetails{
	String name;
	int age;
	String addressIdProof;
	int mobileNumber;
}

class booksDetails{
	String bookName;
	String authorName;
	String bookCatagory;
	String bookEdition;
	double bookPublishDate;
}

class membershipCard{
	String cardholderName;
	double cardValidity;
}

class reminderMessage{
	double rentDate;
	double dueDate;
	String memberName;
	String bookDuration;
}
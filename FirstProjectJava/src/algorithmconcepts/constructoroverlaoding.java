package algorithmconcepts;

public class constructoroverlaoding {

	float average=0;
	   
    
	  constructoroverlaoding(int a,int b)
	  {
		 
		System.out.println("the average is: " + (average =(a+b)/2));
		 
	  }
	  
      constructoroverlaoding()
	  {
		  System.out.println("No data");
	  }
	  constructoroverlaoding(int a,int b, int c)
	  {
		 
		  System.out.println(" the Average is :" + (average =(a+b+c)/2));

	}
	
}

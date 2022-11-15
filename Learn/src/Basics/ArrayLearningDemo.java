package Basics; 

public class ArrayLearningDemo {
     int global;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] ar = new int[5];                     // ARRAY IS ONE OF THE CLASS , SO ar is taken as object
      String[] s = new String[5];
      double[] db = new double[2];
      ArrayLearningDemo[] ald = new ArrayLearningDemo[3]; 

      for(int i: ar) {
    	  System.out.print(" " + i);                // Base value of int is 0 
      }
    
      System.out.println(ar);
      for(String ss : s)
      {
      System.out.print(" " + ss);
      }
      System.out.println(db);
      
      int[] a = {42,56,36};
      System.out.println(a.length);
      
      for(ArrayLearningDemo d : ald)
      {
      System.out.print(" " +d); 
      
	}

}
}

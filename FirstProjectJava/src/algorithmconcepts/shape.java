package algorithmconcepts;

abstract class shape {

	 int breadth,height;
	abstract void area();
//	shape(int b,int h){ 
//		
//		breadth = b;
//		height = h;
//	}

class triangle extends shape {
    
	void area() {
	System.out.println("The Triangle");}
}

class square extends shape{
	
	void area() {
		System.out.println("The Square");
	}
}
}


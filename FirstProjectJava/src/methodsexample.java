
public class methodsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(addition(10,30));
		line();
		System.out.println(addition(785,983));
		line();
		System.out.println(addition(78,83));
		line();
		
        System.out.println(digits(56));
        
        System.out.println(digits(565));
        
        System.out.println(digits(5));
        
        line();
	}
	
	static int addition(int a, int b) {
		return a+b;
	}

	static void line() {
		System.out.println("----------");
	}
	static boolean digits(int a) {
		if(a>9 && a<100)
			return true;
		else
			return false;
			
	}
}


package algorithmconcepts;

public class variableAargDemo {
	
	static double calc(double... value)
	{
		double min = Integer.MAX_VALUE;
		for(double n : value)
		{
		if(n<min)
			min=n;
	}
	return min;
}
	
	static int calc(int... value)
	{
		int min = Integer.MAX_VALUE;
		for(int n : value)
		{
			if(n<min)
				min=n;
		}
		return min;
			
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(calc());
		System.out.println(calc(45,56,8,95,2));
		System.out.println(calc(49.5,5.6,8.3,95.2,2.6));
	}

}

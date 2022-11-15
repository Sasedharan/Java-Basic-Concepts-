package algorithmconcepts;

public class inheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee("Sasi",15000,12.2005);
		e1.display();
		Manager m1 = new Manager("Ram",45000,02.1999,5000);
		System.out.println(m1.salarybonus(10));
	}

}

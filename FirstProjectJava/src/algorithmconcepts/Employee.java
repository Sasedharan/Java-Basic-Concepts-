package algorithmconcepts;

public class Employee {

	private String name;
	private double salary;
	private double date;

Employee(String n,int s,double d){
	name = n;
	salary=s;
	date=d;
}
public double getSalary(int s) {
	return salary;
}
public void setSalary(int s){
	salary = s;
}

public void display(){
	System.out.println(name + salary + date);
	
}
 public double salarybonus(double percentage) {
	 salary =salary + percentage * salary/100;
	 return salary;
 }

}

class Manager extends Employee{
	double bonus;
    Manager(String n,int s,double d,double b){
    	super(n,s,d);
	    bonus =b;
 }
    public double getbonus(double b)
    {
    	return super.getSalary(0) + bonus;
    }

public void display(){
       super.display();
}
}
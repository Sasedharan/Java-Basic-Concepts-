package Basics;

interface vehicle
{
	public void vehiclename();
	public void vehiclecolour();
}
class car implements vehicle
{
	public void vehiclename()
	{
		System.out.println("The Vehicle name is Hundari");
	}
	public void vehiclecolour()
	{
		System.out.println("The Car is Red in Color");
	}
}

public class Interface {
	public void main(String[] args)
	{
		car sale=new car();
		sale.vehiclename();
		sale.vehiclecolour();
	}

}

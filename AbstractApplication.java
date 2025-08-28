package tech.org;
abstract class Vehicle1
{
	abstract void engine();
}
class Bike extends Vehicle1
{
	void engine()
	{
		System.out.println("100 CC");
	}
}
class Car extends Vehicle1
{
	void engine()
	{
		System.out.println("1000 CC");
	}
}
public class AbstractApplication {

	public static void main(String[] args) {
		  
		 Bike b=new Bike();
		 b.engine();
		 Car c=new Car();
		 c.engine();
	}

}

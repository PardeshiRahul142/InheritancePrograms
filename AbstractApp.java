abstract class Vehicle
{
	abstract void engine();
	abstract void defaultColor();
	abstract void feature();
}
class Bike extends Vehicle
{
	void engine()
	{
		System.out.println("I am bike engine");
	}
	void defaultColor()
	{
		
	}
	void feature()
	{
		
	}
}
class Car extends Vehicle
{
	void engine()
	{
		System.out.println("I am Car engine");
	}
	void defaultColor()
	{
		
	}
	void feature()
	{
		
	}
}
public class AbstractApp{
	public static void main(String[] args){
	   Vehicle v =new Bike();
	   v.engine();
	   v=new Car();
	   v.engine();
	}
}

abstract class Vehicle1
{
	abstract void engine();
	abstract void color();
	abstract void feature();
}
class VADP extends Vehicle1
{
	void engine()
	{
		
	}
	void color()
	{
		
	}
	void feature()
	{
		
	}
}
class Bikes extends VADP
{
	void engine()
	{
		System.out.println("I am enginr of Bike");
	}
}
class Cars extends VADP
{
	void engine()
	{
		System.out.println("I am color of Car");
	}
}
public class AdapterClass {
	public static void main(String[] args) 
	{
		Vehicle1 ve=new Bikes();
		ve.engine();
		ve=new Cars();
		ve.engine();

	}

}

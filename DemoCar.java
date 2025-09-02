// Write a program to create a class Car with methods start() and stop(), and call them using an object.
class Car
{
	void start()
	{
		System.out.println("I am car start method");
	}
	void Stop()
	{
		System.out.println("I am car stop method");
	}
}
public class DemoCar {
	public static void main(String[] args)
	{    Car c=new Car();
	     c.start();
	     c.Stop();
		

	}

}

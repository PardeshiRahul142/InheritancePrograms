//Write a program to create a class Circle with a method to calculate the area of a circle using radius, and call it using an object.
class Circle
{    private double pi;
     private double r;
	Circle()
	{
		pi=3.14f;
		r=10;
	}
	Double area()
	{
		double a=pi*r*r;
		return a;
	}
}
public class Carea {
	public static void main(String[] args)
	{   Circle c=new Circle();
	      System.out.println("Area of circle :"+c.area());

	}

}

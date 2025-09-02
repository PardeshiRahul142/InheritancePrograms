//Write a program to create a class Rectangle with methods to calculate area and perimeter using objects.
class Rect
{  int Area(int l , int w)
	{    int a=l*w;
	    return a;
	}
    int Perimeter(int l, int w)
    {
     int p = 2* (l + w);
     return p;
    }
}
public class DemoRectangle {
	public static void main(String[] args)
	{   Rect r=new Rect();
	    System.out.println("Area of rectangle is :"+r.Area(10,19));
	    System.out.println("Primete of rectangle is :"+r.Perimeter(20,30));
		
	}

}

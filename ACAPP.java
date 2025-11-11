/*Q1.Create an abstract class Shape with method abstract double area().
Create an interface Display with method void show().
Implement Display in Circle and Rectangle classes (which extend Shape) to calculate area and display details. 
*/

abstract class Shape
{  abstract double area();
}
interface Display
{ public void show();
}
class Circle extends Shape implements Display
{ double pi=3.14;
  double r=20;
  double ac;
   double area()
   { ac=pi*r*r;
     return ac;
   }
   public void show()
   { 
     System.out.println("Area of circle :"+ac);
   } 
}
class Rectangle extends Shape implements Display
{
  double length=20;
  double breadth=10;
  double ra;
   double area()
   { 
     ra=length*breadth;
     return ra;
   }
   public void show()
   { 
     System.out.println("Rectangle area is :"+ra);
   } 
}
public class ACAPP
{  
   public static void main(String args[])
   {
     Circle c=new Circle();
            c.area();
            c.show();
            
     Rectangle re=new Rectangle();
               re.area();
               re.show();
   }

}
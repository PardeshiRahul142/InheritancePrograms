package org.pack;
class Shape
{
	float pi=3.14f;
	int r=4;
	int l=10;
	int b=20;
	int s1=10;
	int s2=40;
}
class Rectangle extends Shape
{
	float calculateArea()
	{
		float a=l*b;
		return a;
	}
}
class Circle extends Rectangle
{
	float calculateArea()
	{
		float a=(pi*r*r);
		return a;
	}
}
class Triangle extends Circle
{
	float calculateArea()
	{
		float side=s1*s2;
		return side;
	}
}
public class AreaOFShapeApp {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Triangle t=new Triangle();
		System.out.println("Area of Rectangle is :"+r.calculateArea());
		System.out.println("Area of Circle is :"+c.calculateArea());
		System.out.println("Area of Triangle is :"+t.calculateArea());


	}

}

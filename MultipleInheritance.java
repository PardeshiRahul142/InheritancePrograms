package org.pack;
class Value
{   int x,y;
	void setValue(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}
class Add extends Value
{
	void getAdd()
	{
	  System.out.println("Addition is :"+(x+y));
	}
}
class Sub extends Value
{
	void getSub()
	{
		System.out.println("Substraction is :"+(x-y));
	}
}
class Mult extends Value
{
	void getMulti()
	{
		System.out.println("Multiplication is :"+(x*y));
	}
}
class Div extends Value
{
	void getDiv()
	{
		System.out.println("Division is :"+(x/y));
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		  Add ad=new Add();
		      ad.setValue(10, 30);
		      ad.getAdd();
		  Sub sb=new Sub();
		     sb.setValue(39, 30);
		     sb.getSub();
		  Mult m=new Mult();
		      m.setValue(20, 10);
		      m.getMulti();
		 Div d=new Div();
			d.setValue(200, 10);
		    d.getDiv();
   }
}

//Write a program to create a class Calculator with methods add(), subtract(), multiply(), and divide(), and call them using objects.
class Calc
{
	int a;
	int b;
	Calc()
	{
		a=10;
		b=20;
	}
	int add()
	{
		return a+b;
	}
	int sub()
	{
		return b-a;
	}
	int mul()
	{
		return a*b;
	}
	int div()
	{
		return b/a;
	}
}
public class Calculator1
{  public static void main(String args[])
     {  Calc c=new Calc();
             System.out.println("Addition :"+c.add());
             System.out.println("Substraction :"+c.sub());
             System.out.println("Multiplication :"+c.mul());
             System.out.println("Dividation :"+c.div());
             
}
}

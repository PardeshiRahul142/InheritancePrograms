package org.pack;
class Operation 
{
	int a=10;
	int b=20;
}
class Addition extends Operation
{
	void calulate()
	{
		System.out.println("a+b:"+(a+b));
	}
}
class Substract extends Addition
{
	void calulate()
	{
		System.out.println("a-b :"+(a-b));
	}
}
class Multiplication extends Substract
{
	void calulate()
	{
		System.out.println("a*b :"+(a*b));
	}
}
class Division extends Multiplication
{
	void calulate()
	{
		System.out.println("a/b :"+a/b);
	}
}
public class CalculatorApp {

	public static void main(String[] args) {
        Addition ad=new Addition();
        Substract sb=new Substract();
        Multiplication ml=new Multiplication();
		Division dv=new Division();
		
		ad.calulate();
		sb.calulate();
		ml.calulate();
		dv.calulate();
		        
	}

}

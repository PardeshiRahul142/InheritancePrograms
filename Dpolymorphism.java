package Ayx.psck;
class Values
{
	int a,b;
	void setValue(int x,int y)
	{
		a=x;
		b=y;
	}
	int getResult()
	{
		return 0;
	}
}
class Adds extends Values
{
	int getResult()
	{
		return a+b;
	}
}
class Mul extends Values
{
	int getResult()
	{
		return a*b;
	}
}
public class Dpolymorphism {

	public static void main(String[] args) {
		Values v=null;
		v=new Adds();
		v.setValue(10, 20);
		int r=v.getResult();
		System.out.println("the addition is :"+r);
		
		v=new Mul();
		v.setValue(10,30);
		int res=v.getResult();
		System.out.println("Multiplication is :"+res);
	}
}

package org.pack;
class D
{
	D(int x)
	{
		System.out.println("I am constructor of class D"+x);
	}
}
class AA extends D
{
	AA(int y)
	{
		super(100);
		System.out.println("I am constructor of class AA"+y);
	}
}
class BB extends AA
{
	 BB()
	 {
		 super(1200);
		 System.out.println("I am constructor of class child ");
	 }
}
public class CSAApp {

	public static void main(String[] args) {
		BB bb=new BB();

	}

}

package org.pack;
class A
{ 
	A(int x)
	{
		System.out.println("I am Constructor A"+x);
	}
}
class B extends A
{  
	 B()
	{   
		 super(100);
		System.out.println("I am Constructor B");
	}
}
public class CIAPP {

	public static void main(String[] args) {
		
		B b=new B();
		

	}

}

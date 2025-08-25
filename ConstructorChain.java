package org.pack;

public class ConstructorChain {

	ConstructorChain()
	{
		this(10);
		System.out.println("I am default constructor");
	}
	ConstructorChain(int x)
	{
		 this(3.0f);
		 System.out.println("I am integer constructor");
	}
	ConstructorChain(float a)
	{
		System.out.println("I am float constructor");
	}
	public static void main(String[] args) {
		ConstructorChain sc=new ConstructorChain();

	}

}

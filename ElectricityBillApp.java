package org.pack;
class Customer
{
	String name="Abc";
	int units=10;
}
class Bill extends Customer
{    int n;
	void billCal()
	{
		if(units <= 100)
		{
			 n=(units*5);
			System.out.println("units <=100 bill is :"+n);
		}
		else if(units <=200)
		{
			 n=(units*7);
			System.out.println("units <=100 bill is :"+n);
		}
		else
		{
			 n=(units*8);
			System.out.println("units <=100 bill is :"+n);
		}
	}
	void display()
	{
		System.out.println("Customer name is :"+name);
		System.out.println("Consumed units is :"+units);
	}
}
public class ElectricityBillApp {

	public static void main(String[] args) {
		Bill b=new Bill();
		b.display();
		b.billCal();

	}

}

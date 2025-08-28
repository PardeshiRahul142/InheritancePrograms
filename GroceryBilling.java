//🔸 Question 4: Grocery Billing System – Apply Discount Based on Customer Type
//
//Description:
//Create a class Customer with fields name and totalBill. Then create 3 customer types by extending it
//: RegularCustomer, PremiumCustomer, and NewCustomer.
//
//Each should override a method applyDiscount() which deducts a discount from the bill:
//
//Regular: 5%
//
//Premium: 15%
//
//New: No discount
//
//Task:
//
//Create an array of different customer objects. Apply discount and print final bill for each.
//
//Objective:
//Use runtime polymorphism with inheritance, without involving interfaces or enums.
package Ayx.psck;
class Customer
{
	
	String name;
	double TotalBill;
	
	Customer(String name,double TotalBill)
	{
		this.name=name;
		this.TotalBill=TotalBill;	
	}
	void discount()
	{
		System.out.println("Not discount");
	}
}
class Regular extends Customer
{
	Regular(String name,double TotalBill)
	{
		super(name,TotalBill);
	}
	void discount()
	{
		double finalBill=(TotalBill * 0.05);
		System.out.println("I am "+ name +" Regular customer total Bill after 5% discount :"+finalBill);
	}
}
class Premium extends Customer
{
	Premium(String name , double TotalBill)
	{
		super(name,TotalBill);
	}
	void discount()
	{
		double finalBill=TotalBill * 0.15;
		System.out.println("I am"+ name +" Premium customer total Bill after 15% discount :"+finalBill);
	}
}
class NewCustomer extends Customer
{
	NewCustomer(String name , int TotalBill)
	{
		super(name,TotalBill);
	}
	void discount()
	{
		System.out.println("I am "+ name +" NewCustomer I have no discount"+TotalBill);
	}
}
class ObjCustomer
{
	void discount(Customer[] cust)
	{
		for(int i=0;i<cust.length;i++)
		{
		 Customer c=cust[i];
		c.discount();
		
		}
	}
}
public class GroceryBilling {
	public static void main(String[] args) {
		
		ObjCustomer ob=new ObjCustomer();
		Regular reg=new Regular("Rahul",1000);
		Premium pre=new Premium("Rohan",3000);
		NewCustomer cus=new NewCustomer("Parsad",1000);
		
		Customer[] c= {cus,reg,pre};
		ob.discount(c);
	}

}

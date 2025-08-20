//Q.3
//Create a class Account with accountNumber, name, balance. 
//Create a subclass SavingsAccount that calculates interest (e.g., 5% annually) and adds it to the balance.
//
//Output: Show updated balance after interest.
//
package org.pack;
class Account
{
	int acc_no=20;
	String name="Rahul";
	double balance=100000;
}
class SavingAcc extends Account
{ 
	double UpdatedAmt;
	void calculateInterest()
	{
		double interest = balance * 0.05;
	     UpdatedAmt =balance+ interest;
	}
	void display()
	{
		System.out.println("Account number is :"+acc_no);
		System.out.println("Name is :"+name);
		System.out.println("Balance is :"+balance);
		System.out.println("After interst balance is :"+UpdatedAmt);
	}
}
   
public class BankApp{
	
	public static void main(String[] args){
		SavingAcc sv=new SavingAcc();
		sv.calculateInterest();
		sv.display();
		
   }
}

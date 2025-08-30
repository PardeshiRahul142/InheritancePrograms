//Question 6: Banking System – Interest Calculation for Different Accounts
//
//Description:
//Create a base class BankAccount with fields accountNumber, balance, and a method calculateInterest().
//Create subclasses:
//
//SavingsAccount – 4% interest
//
//CurrentAccount – No interest
//
//FixedDepositAccount – 6.5% interest
//
//Task:
//
//Create multiple accounts and store them in an array.
//
//Loop through and calculate interest for each using polymorphism.
//
//Goal:
//Understand runtime method overriding without using any abstract/interface-based design.
package Ayx.psck;
class BankAccount
{
	int accountNumber;
	double balance;
	BankAccount(int accNo , int bal)
	{
		this.accountNumber=accNo;
		this.balance=bal;
	}
	public void calculateIntrest()
	{
		
	}
	public void totalInterst() {
		// TODO Auto-generated method stub
		
	}
}
class SavingAccount extends BankAccount
{
	SavingAccount(int accNo,int bal)
	{
		super(accNo,bal);
	}
	public void calaculateIntrest()
	{
		double totalIntrest=balance * 0.04;
		System.out.println("Total intrst on SavingAccount :"+totalIntrest);
		
	}
	public void totalInterst() {
		// TODO Auto-generated method stub
		
	}
}
class CurrentAccount extends BankAccount
{
	CurrentAccount(int accNo , int bal)
	{
		super(accNo , bal);
	}
	void totalIntrest()
	{
		System.out.println("Current account having no Interst :"+balance);
	}
}
class FixedDepositAccount extends BankAccount
{
	FixedDepositAccount(int accNo,int bal)
	{
		super(accNo , bal);
	}
	public void totalInterst()
	{
		double totalIntrest=balance*06.5;
		System.out.println("intrest on Fixed Deposite account :"+totalIntrest);
	}
}
class DemoBank
{
	void Calculate(BankAccount [] bk)
	{
		for(int i=0;i<bk.length;i++)
		{
			bk[i].totalInterst();
		}
	}
}
public class BankingApp {

	public static void main(String[] args) {
        
		SavingAccount dm=new SavingAccount(1,29999);
		dm.totalInterst();
		CurrentAccount ca=new CurrentAccount(2,50000);
		ca.totalIntrest();
		FixedDepositAccount fd=new FixedDepositAccount(3,10000);
		fd.totalInterst();
        
		DemoBank demo=new DemoBank();
		BankAccount acc[]= {dm,ca,fd};
		demo.Calculate(acc);
		
	}

}

// Write a program to create a class BankAccount with methods deposit() and withdraw(), and call them using objects.
class BankAccount1
{   private int accno;
	private String name;
	private int balance;
	private int totalBal;
	BankAccount1(int accno,String name , int balance)
	{    this.accno=accno;
		this.name=name;
		this.balance=balance;
	}
	void deposite(int depamt)
	{    totalBal=balance+depamt;
		System.out.println("Total amount after deposite :"+totalBal);
	}
	void withdrow(int withdrow)
	{   int total=totalBal-withdrow;
		System.out.println("Total amount after withdrow :"+total);
	}
	
}
public class DemoBank {
	public static void main(String[] args) 
	{    BankAccount1 bc=new BankAccount1(1,"Rahul",20000);
	                  bc.deposite(10000);
	                  bc.withdrow(5000);
	

	}

}

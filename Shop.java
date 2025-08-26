package Ayx.psck;
class Order 
{  
	int order;
	int price;
	public void calculate(int o,int p)
	{
		order=o;
		price=p;
	}
	public void pay(double amount)
	{
		System.out.println("Total price method ");
	}
}
class CashPayment extends Order
{
	public void price(double amount)
	{
		System.out.println("Tota; price is"+amount+"and Cash Payment");
	}
}
class CardPayment extends Order
{
	public void pay(double amount)
	{
	System.out.println("Total price is "+amount +"and cardPayment");
	}
}
class OnlineWalletPayment extends Order
{
	public void pay(double amount)
	{
		System.out.println("Total price is "+amount+"and OnlineWalletPayment");
	}
}
public class Shop {

	public static void main(String[] args) {
		
		Order o=new CashPayment();
		    o.pay(120.30);
		Order or=new CardPayment();
		     or.pay(1000.10);
		Order ord=new OnlineWalletPayment();
		     ord.pay(1000.203);
  }
}


	

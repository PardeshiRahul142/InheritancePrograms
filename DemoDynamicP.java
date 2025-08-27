package Ayx.psck;
class Payment
{
	int order;
	int price;
	void Payment(int o , int p)
	{
		order=o;
		price=p;
	}
	int TotalPay()
	{
		return 0;
	}
}
class Cash extends Payment
{
	int TotalPay()
	{
		int totalAmt=price * order;
		return totalAmt;
	}
}
class Online extends Payment
{
	int TotalPay()
	{
		int totalAmt=price * order;
		return totalAmt;
	}
}
class WalletPayment extends Payment
{
	int TotalPay()
	{
		int totalAmt=price*order;
		return totalAmt;
	}
}
public class DemoDynamicP {

	public static void main(String[] args) {
		Payment p = null;
		p=new Cash();
		p.Payment(2,3000);
		int r=p.TotalPay();
		System.out.println("The payment cash is :"+r);
		p=new Online();
		p.Payment(3,1000);
		int res=p.TotalPay();
		System.out.println("The payment online is :"+res);
		p=new WalletPayment();
		p.Payment(2,4403);
		int result=p.TotalPay();
		System.out.println("The payment wallet is :"+result);
	}
}

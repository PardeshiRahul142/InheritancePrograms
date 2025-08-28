//program of abstract class cannot create object but we create reference;
package tech.org;
abstract class Company
{
	
	abstract void laptop();
}
class Devloper extends Company
{
	
	void laptop()
	{
		System.out.println("I am devloper use laptop");
	}
}
class Tester extends Company
{
	
	void laptop()
	{
		System.out.println("I am tester use of laptop");
	}
}
public class AbstractClassRefrence {

	public static void main(String[] args) {
		
		Company cm=new Devloper();
		 cm.laptop();
		 cm=new Tester();
		 cm.laptop();
	}

}

package Ayx.psck;
class R
{
	void display()
	{
		System.out.println("I am class R");
	}
}
class S extends R
{
	void display()
	{
		System.out.println("I am class S");
	}
}
class P extends R
{
	void display()
	{
		System.out.println("I am class P");
	}
}
public class RunTimePoly {

	public static void main(String[] args) {
		R obj=new R();
		obj.display();
		obj=new S();
		obj.display();
		obj=new P();
		obj.display();
		

	}

}

package Ayx.psck;
class AAA
{
	private static AAA a1=null;
	private AAA()
	{
		System.out.println("I am AAA constructor");
	}
	public static AAA getInstance()
	{
		if(a1==null)
		{
			a1=new AAA();
			System.out.println("Hash code in AAA reference "+System.identityHashCode(a1));
		}
		return a1;
	}
}
public class SingletonClass {
	public static void main(String[] args) 
	{
	AAA a1=AAA.getInstance();
	System.out.println("Hash code of a1 "+System.identityHashCode(a1));
	AAA a2 =AAA.getInstance();
	System.out.println("Hash code of a2 "+System.identityHashCode(a2));
	AAA a3=AAA.getInstance();
	System.out.println("Hash code of a3 "+System.identityHashCode(a3));
	}

}


//1. Write a program to create a class Student with data members id and name, create an object, and display the values.
class S
{
	private int id;
	private String name;
	 public S(int id,String name)
	 {
		this.id=id;
		this.name=name;
	 }
	 void display()
	 {
		 System.out.println("Id is:"+id);
		 System.out.println("Name is :"+name);
	 }
}
public class ABCStudent {
	public static void main(String[] args) 
	{    S s=new S(1,"Rahul");
	       s.display();
	

	}

}

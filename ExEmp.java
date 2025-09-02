//4. Write a program to create a class Employee with data members id, name, and salary, 
//and display employee details using an object.
class Employee1
{
	private int id;
	private String name;
	private int salary;
	
	Employee1(int id , String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("The id id:"+id);
		System.out.println("The name is :"+name);
		System.out.println("The salary is :"+salary);
	}
}
public class ExEmp {
	public static void main(String[] args) 
	{    Employee1 e=new Employee1(1,"Rahul",21000);
	       e.display();
		

	}

}

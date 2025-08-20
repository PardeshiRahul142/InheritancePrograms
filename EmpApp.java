package org.pack;
class Employeee
{
	int id=1;
	String name="Rahul";
	double salary=51000;
	
	}
class Manager extends Employeee
{   
	int mid=1;
	String mname="Rajput";
	double mSalary=320000;
	double bonus;
	double totalSal;
	void bonus()
	{
		bonus = salary * 0.10;
		
	}
	void totalSalary()
	{
		totalSal =salary + bonus;
	}
	void display()
	{ 
		System.out.println("Employe details is :");
		System.out.println("id is :"+id);
		System.out.println("Name is :"+name);
		System.out.println("Salary is :"+salary);
		System.out.println("After bonus total salary is :"+totalSal);
	}

	void displayManager()
	{
		System.out.println("Manager id is :"+mid);
		System.out.println("Manager Name is :"+mname);
		System.out.println("Manager Salary is :"+mSalary);
	}
}
public class EmpApp {

	public static void main(String[] args) {
		
		Manager m=new Manager();
		      m.bonus();
		      m.totalSalary();
		      m.display();
		      System.out.println();
		      m.displayManager();
		      
	}

}

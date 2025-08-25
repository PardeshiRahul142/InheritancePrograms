//Assignment 2: Employee Salary Example
//
//Question:
//Create a base class Employee with a method calculateSalary().
//Override the method in Manager and Developer classes to calculate salary differently.
//Demonstrate overriding by creating objects of both subclasses and calling the method.
//
//Input (object creation in main):
//
//Employee e1 = new Manager();
//Employee e2 = new Developer();
//e1.calculateSalary();
//e2.calculateSalary();
//
//
//Expected Output:
//
//Manager salary is: 80000
//Developer salary is: 50000
package org.pack;
import java.util.*;
class EmployeEx
{   void calculateSalary(int m)
	{
	
	}
}
class Manager1 extends EmployeEx
{    void calculateSalary(int amt)
	{    System.out.println("Manager salary is "+amt);
	}	
}
class Devloper extends EmployeEx
{    void calculateSalary(int amt)
	{    System.out.println("Devloper salary is :"+amt);
	}
}
public class EmployeeSalaryProgram 
{	public static void main(String[] args) 
    {
		EmployeEx e1=new Manager1();
		e1.calculateSalary(80000);
		EmployeEx e2=new Devloper();
		e2.calculateSalary(50000);
    }
}

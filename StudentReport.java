//
//🔸 Question 3: Student Performance Report – Calculate Grade Differently for Each Stream
//
//Description:
//Create a base class Student with fields name, marks and a method calculateGrade(). 
//Then create 3 classes: ScienceStudent, CommerceStudent, and ArtsStudent.
//Each should override calculateGrade() with its own logic.
//
//Task:
//
//Write a method printGrades(Student[] students) that prints the name and grade of each student,
//using the overridden method.
//
//Objective:
//Practice polymorphism through method overriding and 
//processing a list of parent-class objects that use child-class logic.
package Ayx.psck;
import java.util.*;
class Student
{
	int marks;
	String name;
	
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	String calculateGrade()
	{
		return"not calculated";
	}
}
class Science extends Student
{
	Science(String name, int marks) {
		super(name, marks);
	}

	String calculateGrade()
	{
		if(marks>=90)
		{
			return "A";
		}else if(marks<=80)
		{
			return "b";
		}else {
		return "D";
		}
	}
}
class Commerce extends Student
{
	Commerce(String name, int marks) {
		super(name, marks);
		
	}

	String calculateGrade()
	{
		if(marks>=70)
		{
			return "A";
		}else if(marks<=60)
		{
			return "b";
		}else {
		return "D";
		}
	}
}
class Ssmpl{
	
	void printGrades(Student [] student)
	{
		for(int i=0;i<student.length;i++)
		{
			Student students=student[i];
			System.out.println(students.name+" "+students.calculateGrade());
		}
	}
	
}
public class StudentReport {

	public static void main(String[] args) {
		
		 Ssmpl a=new Ssmpl();
		 Science s=new Science("Rahul",90);
		 Commerce c=new Commerce("ganesh", 60);
		 
		 Student [] s1= {s,c};
		 a.printGrades(s1);
	   
	}

}

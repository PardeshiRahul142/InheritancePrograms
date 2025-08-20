package org.pack;
class Person
{
	String name="Rohan";
	int age=33;
}
class Stud1 extends Person
{
	int rollNo=1;
	String course="JavafullStack";
}
class GraduateStudent extends Stud1
{
	int marks=80;
	void display()
	{
		System.out.println("Roll no is :"+rollNo);
		System.out.println("course is :"+course);
		System.out.println("Marks is :"+marks);
	}
}
public class StApp {

	public static void main(String[] args) {
		GraduateStudent gd=new GraduateStudent();
		gd.display();

	}
}

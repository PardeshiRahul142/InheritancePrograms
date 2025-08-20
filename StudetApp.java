package org.pack;
class Student12
{
	int rollNo=20;
	String name="Rahul";
}
class Marks extends Student12
{
	int subject1=90;
	int subject2=70;
	int subject3=98;
	
	void calPer()
	{
		int total=subject1 + subject2+subject3;
		System.out.println("Total marks is :"+total);
		System.out.println("percentage is :"+(total/3));
	}
	void display()
	{
		System.out.println("Roll No is :"+rollNo);
		System.out.println("Name is :"+name);
		System.out.println("Marks of all subject :"+ subject1 +" "+ subject2 +" "+ subject3);
	}
}
public class StudetApp {

	public static void main(String[] args) {
		Marks m=new Marks();
		m.display();
		m.calPer();

	}

}

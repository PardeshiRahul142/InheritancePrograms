//Assignment 1: Vehicle Example
//
//Question:
//Create a base class Vehicle with a method move().
//Override the method in Car and Bike classes to display different messages.
//Demonstrate runtime polymorphism by calling the method with different objects.
//
//Input (object creation in main):
//
//Vehicle v1 = new Car();
//Vehicle v2 = new Bike();
//v1.move();
//v2.move();
//
//
//Expected Output:
//
//Car is moving on four wheels.
//Bike is moving on two wheels.
package org.pack;
import java.util.*;
class Vehicle
{   void move()
	{   System.out.println(" I am vehicle move");
	}
}
class Car extends Vehicle
{    void move()
	{  System.out.println("Car moveing on four wheels");
	}	
}
class Bike extends Vehicle
{  void move()
	{   System.out.println("Bike move on two wheels");
	}
}
public class VehicleProgram 
{    public static void main(String[] args) 
     {
		Vehicle v1=new Car();
		v1.move();
		Vehicle v2=new Bike();
		v1.move();
		
	}

}

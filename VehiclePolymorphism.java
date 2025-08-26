//🔸 Question 2: Vehicle Movement – Dynamic Behavior Based on Vehicle Type
//
//Description:
//Create a base class Vehicle with a method move(). Create 3 subclasses: Car, Bike, and Bus. Each subclass should override the move() method with its own behavior.
//
//Task:
//
//Write a function startJourney(Vehicle v) that accepts any vehicle object and calls its move() method.
//
//Objective:
//Show dynamic method dispatch where the decision of which move() method to call happens at runtime
package Ayx.psck;
class Vehicle
{
	public void move()
	{
		System.out.println("I am move method of vehicle");
	}
}
class Car extends Vehicle
{
	public void move()
	{
		System.out.println("I am move method of car");
	}
}
class Bike extends Vehicle
{
	public void move()
	{
		System.out.println("I am move method of Bike");
	}
}
class Bus extends Vehicle
{
	public void move()
	{
		System.out.println("I am move method of bus ");
	}
}
class DemoVehicle
{
	public void startJourney(Vehicle v)
	{
		v.move();
	}
}
public class VehiclePolymorphism {

	public static void main(String[] args) {
		DemoVehicle d=new DemoVehicle();
		Vehicle v1=new Bike();
		Vehicle v2=new Bus();
		Vehicle v3=new Car();
		
		d.startJourney(v1);
		d.startJourney(v2);
		d.startJourney(v3);

	}
}

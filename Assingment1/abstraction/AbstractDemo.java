package Assingment1.abstraction;

abstract class Vehicle{
	String vehicleName;
	String vehicleColour;
	
	public Vehicle(String vehicleName,String vehicleColour) {
		this.vehicleName=vehicleName;
		this.vehicleColour=vehicleColour;
	}
	
	public abstract void display();
}

class Bike extends Vehicle{
	
	public Bike(String bikeName,String bikeColour) {
		super(bikeName,bikeColour);
	}

	@Override
	public void display() {
		System.out.println("in bike class");
	}
}

class Car extends Vehicle{
	
	public Car(String carName,String carColour) {
		super(carName,carColour);
	}

	@Override
	public void display() {
		System.out.println("in car class");
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		Vehicle vehicle1 = new Bike("RR 310","Red");
		Vehicle vehicle2 = new Car("Swift","Red");
		vehicle1.display();
		vehicle2.display();
	}
}
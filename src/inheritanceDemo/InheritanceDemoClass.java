package inheritanceDemo;
class Vehicle{
	String brand;
	int speed;
	void startEngine() {
		System.out.println("Engine started");
		
	}
	void stop() {
		System.out.println("Engine stopped");
		
	}

}
class Car extends Vehicle{
	int doors;
	void honk () {
		System.out.println("Car is honking");
	}
	
}
class Bike extends Vehicle{
	boolean hasSidecar;
	void wheelie() {
		System.out.println("bike has Wheelie");
	}
	
}

public class InheritanceDemoClass {

	public static void main(String[] args) {
	
		Car obj1= new Car();
		obj1.brand="Breeza";
		System.out.println(obj1.brand);
		obj1.speed=100;
		System.out.println(obj1.speed);
		obj1.startEngine();
		obj1.doors=4;
		obj1.honk();
		obj1.stop();
		
		
		Bike obj2= new Bike();
		obj2.brand="Pulsar";
		System.out.println(obj2.brand);
		obj2.speed=80;
		System.out.println(obj2.speed);
		obj2.hasSidecar=true;
		obj2.wheelie();
		obj1.startEngine();
		obj1.stop();
	
		

	}

}

package vehicleInterfaceDemo;
interface Vehicle{
	final int MAX_SPPED=120;
	void start();
	void showFuelType();
	void getSpeed();
}

class Car implements Vehicle {
	 String brand;
	 int speed=80;
	 Car(String brand){
		 this.brand=brand;
	
	 }
	void display(){
		System.out.println("Brand :" +brand);
		

		 
	 }

	@Override
	public void start() {
		System.out.println("Car Started.");
		
	}

	@Override
	public void showFuelType() {
		System.out.println("Fuel Type :" + "Petrol");
		
	}

	@Override
	public void getSpeed() {
		System.out.println("Speed :" +speed );
		System.out.println("Max Allowed :" +MAX_SPPED );
		
	}
	
	
}

class Bike implements Vehicle{
	String model;
	int speed=80;
	Bike(String model){
		this.model=model;
		
	}
	
	void display() {
		System.out.println(model);
		
	}

	@Override
	public void start() {
		System.out.println("Bike started");
		
	}

	@Override
	public void showFuelType() {
		System.out.println("Fuel Type:" + "Petrol/Electrical");
		
	}

	@Override
	public void getSpeed() {
		System.out.println("Speed :" + speed);
		System.out.println("Max Allowed :" +MAX_SPPED );
		
	}
	
}
public class VehicleInterface {

	public static void main(String[] args) {
		Car C1= new Car("Breeza");
		C1.start();
		C1.display();
		C1.showFuelType();
		C1.getSpeed();
		
		
		Bike B1=new Bike("Honda");
		B1.start();
		B1.showFuelType();
		B1.getSpeed();
		

	}

}

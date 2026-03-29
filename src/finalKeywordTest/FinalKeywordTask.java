package finalKeywordTest;
class Vehicle{
	final int Max_speed =100;
	final void startEngine() {
		System.out.println("Engine started");
	}
}

class Car extends Vehicle{
	void startEngine() {
		System.out.println("Engine is starting");
	}
	
}

public class FinalKeywordTask {

	public static void main(String[] args) {
		Car obj1= new Car();
		obj1.startEngine();
		obj1.Max_speed=150;
		
		
		
		
		
		

	}

}

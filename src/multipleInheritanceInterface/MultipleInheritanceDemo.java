package multipleInheritanceInterface;
interface chargeble{
	void charge(int percentage);
	void getBatterylevel();
		
	}

interface Connectable{
	void connectToWifi(String network);
	void connectToBluetooth(String device);
}
class SmartPhone implements chargeble, Connectable{
	String brand;
	int battery=0;
	String wifiName;
	String btDevice;
	
	void brand(String brand){
		this.brand=brand;
		System.out.println("Brand is:" +brand);
	}
	@Override
	public void connectToWifi(String wifiName) {
		System.out.println("Connected to Wifi :"+ wifiName);
		
	}
	@Override
	public void connectToBluetooth(String btDevice) {
		System.out.println("Connected to bluetooth :" + btDevice);
		
	}
	@Override
	public void charge(int percentage) {
		System.out.println("Charging"+" " +brand +" "+ "to"+" "+percentage+ "%----");
		
	}
	@Override
	public void getBatterylevel() {
		System.out.println("Current battery level is:" + "75%");
		
	}
	
}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		SmartPhone obj1= new SmartPhone();
		obj1.brand("Samsung");
		obj1.charge(75);
		obj1.connectToWifi("HomeNet");
		obj1.connectToBluetooth("JBL Speaker");
		obj1.getBatterylevel();
		
		
		

	}

}

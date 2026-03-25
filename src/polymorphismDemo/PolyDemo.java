package polymorphismDemo;
class Calculator{
	void add(int a, int b) {
		System.out.println(a+b);
	}
	double add(double a,double b) {
		System.out.println(a+b);
		return a+b;
	}
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}
}

public class PolyDemo {

	public static void main(String[] args) {
		Calculator obj1= new Calculator();
		obj1.add(5,10);
		obj1.add(2.5, 2.5);
		obj1.add(5, 5,5);
			
		

	}

}

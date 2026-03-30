package shapeAreaCalc;
class Shape{
	void  calculateArea(){
		System.out.println("calculating area");
		
	}
}

class Circle extends Shape{
	void calculateArea() {
		double π = 3.14;
		int r=10;
		double area=π*r*r;
		
		System.out.println("Circle Area is : " + area);
	
	}
	
	
}
class Rectangle extends Shape{
	void calculateArea() {
		int l=10;
		int w=50;
		int area=l*w;
		
		System.out.println("Rectangle Area is : " + area);
	}
}

public class ShapeAreaCalculator {

	public static void main(String[] args) {
		Circle obj1 = new Circle();
		obj1.calculateArea();
		
		Rectangle obj2 = new Rectangle();
		obj2.calculateArea();

	}

}

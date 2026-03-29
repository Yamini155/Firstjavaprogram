package shapeAreaCalc;
class Shape{
	void  calculateArea(){
		System.out.println("claculating area");
		
	}
}

class Circle extends Shape{
	void calculateArea() {
		System.out.println("circle is round");
	}
	
	
}
class Rectangle extends Shape{
	void calculateArea() {
		System.out.println("Rectangle is box");
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

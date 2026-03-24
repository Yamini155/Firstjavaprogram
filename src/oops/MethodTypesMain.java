package oops;

public class MethodTypesMain {

	public static void main(String[] args) {
		
//		no parameter no return
		MethodTypesTest m1 = new MethodTypesTest();
		m1.printnumbers();
		
//		no parameter with return
		MethodTypesTest m2 = new MethodTypesTest();
		int result=m2.fixedNumber();
		System.out.println(result);
		
//		with parameters, no return
		MethodTypesTest m3 = new MethodTypesTest();
		int num=5;
		m3.printTable(num);
		
//		with parameters with return
		MethodTypesTest m4 = new MethodTypesTest();
		int maximum=m4.maxNumber(20,50);
		System.out.println(maximum);

	}

}

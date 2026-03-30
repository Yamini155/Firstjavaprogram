package studentStaticDemo;

public class StudentStaticClass {
	static int totalStudents=0;
	StudentStaticClass(){
		
		totalStudents++;
	}
	
	static void display() {
		System.out.println("display total students :" + totalStudents );
	}

}

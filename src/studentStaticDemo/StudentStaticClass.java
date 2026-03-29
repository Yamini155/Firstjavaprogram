package studentStaticDemo;

public class StudentStaticClass {
	static int totalStudents=0;
	StudentStaticClass(){
		
		totalStudents+=10;
	}
	
	static void display() {
		System.out.println("display total students :" + totalStudents );
	}

}

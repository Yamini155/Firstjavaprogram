package p5;

public class LogicalTest {

	public static void main(String[] args) {
		//Question 6
		
		int age=10;
		int height=165;
		
		boolean entry=(age>5) && (height<180);
		System.out.println("entry allowed :" + entry);
		
		
			
		
	
//	Question 7
	
	boolean isStudent = false;
	boolean hasMemberShip = true;

	boolean discount= (isStudent==false)|| (hasMemberShip==true);
	System.out.println("customer gets discount :" + discount );

	
	
//	Question 8
	
	boolean isLocked=true;
	System.out.println("door unlocked :" + (!isLocked));
	
	
	
}
		

}

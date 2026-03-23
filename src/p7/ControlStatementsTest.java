package p7;

public class ControlStatementsTest {

	public static void main(String[] args) {
		
//		if else
//   Question 1
		
		int age=16;
		if(age>=18) {
			System.out.println("entry :" + "entry allowed");
		}else {
			System.out.println("entry :" + "entry not allowed");
		}
		
//		Question 2
		
		int salary=45000;
		if(salary>=30000) {
			System.out.println("status :" + "loan approved");
		}else {
			System.out.println("status :" + "loan rejected" );
			
		}
		
//		if else if condition
		
//		Question 3
		
		int marks=73;
		if(marks>=90) {
			System.out.println("grade is :" + 'A');
		}else if(marks>=75) {
			System.out.println("grade is :" + 'B');	
		}else if(marks>=60) {
			System.out.println("grade is :" + 'C');
		}else if(marks>=45) {
			System.out.println("grade is :" + 'D');
		}else {
			System.out.println("grade is :" + 'F');
		}
		
//		Question 4
		
		int billAmount=1200;
		if(billAmount>=2000) {
			System.out.println("Discount percentage is :" + "20%");
		}else if(billAmount>=1000) {
			System.out.println("Discount percentage is :" + "10%");
		}else if(billAmount>=500) {
			System.out.println("Discount percentage is :" + "5%");
		}else {
			System.out.println("Discount percentage is :" + "no discount");
		}
		
//		Question 5
		int temperature=38;
		if(temperature>=35) {
			System.out.println("temperature is :" + "very Hot");
		}else if(temperature>=25) {
			System.out.println("temperature is :" + "Warm");
		}else if(temperature>=15) {
			System.out.println("temperature is :" + "Pleasent");
		}else {
			System.out.println("temperature is :" + "Cold");
		}
		
			
//		switch statement
//		Question 6
		
			int dayNumber=3;
			switch(dayNumber){
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("Wednesday");
					break;
				case 4:
					System.out.println("Thursday");
					break;
				case 5:
					System.out.println("Friday");
					break;
				case 6:
					System.out.println("Saturday");
					break;
				case 7:
					System.out.println("Sunday");
					break;
					default :
						System.out.println("Invalid day");
						

					
			}
			
//			Question 7
			
			String day="Monday";
			switch(day) {
			case "Monday":
				System.out.println("Idli");
				break;
			case "Tuesday":
				System.out.println("Dosa");
				break;
			case "Wednesday":
				System.out.println("Poha");
				break;
			case "Thursday":
				System.out.println("Upma");
				break;
			case "Friday":
				System.out.println("Vada");
				break;
			case "Saturday":
			case "Sunday":
				System.out.println("No special today");
				break;
				default :
					System.out.println("Invalid day");
			
			}
			
			
		}
			
		

	

	}
	

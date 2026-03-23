package p8;

public class LoopStatementsTest {

	public static void main(String[] args) {
//		for loop
//		Question 1
		
		for(int i=1;i<=10;i++ ) {
			System.out.println(i);
		}
		
//		Question 2
		
		for(int i=1;i<=10;i++) {
			System.out.println("5 * " + i + "=" + 5*i);
		}
		
//		Question 3
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum += i;
			
		}
		System.out.println("total is :" + sum);
		
//		while loop
//		Question 4
		
		int i=10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		System.out.println("Rocket Launched");
		
		  
		
//		Question 5
		int balance=1000;
		int month=1;
		while(balance<5000) {
			balance+=500;
			System.out.println("Month :" + month +"=" + balance);
			
			month++;
			}
		
		

//				Question 6
		int j = 1;
		while (j <= 20) {
		    if (j % 2 == 0) {
		        System.out.println(j);
		    }
		    j++; 
		}
		
//		do while loop
//		Question 7
		int round=1;
		do {
		System.out.println("Practicing... round " + round);
		round++;
		}while(round<=5);
		
//		Question 8
		int count=1;
		do {
			System.out.println("--vending machine--");
			System.out.println("1. Water  - ₹10");
			System.out.println("2. Juice  - ₹30");
			System.out.println("3. Soda  - ₹20");
		
			count++;
		}while(count<=3);
		

	}

}

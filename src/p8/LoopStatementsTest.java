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
			sum = sum + i;
			
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
		

//				Question 6
		int j = 1;
		while (j <= 20) {
		    if (j % 2 == 0) {
		        System.out.println(j);
		    }
		    j++; 
		}
		

	}

}

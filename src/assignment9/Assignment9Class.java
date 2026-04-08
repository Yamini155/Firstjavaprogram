package assignment9;

public class Assignment9Class {

	private static char[] j;

	public static void main(String[] args) {
		// Question 1
		
		int N=10;
		int sum=0;
		for(int i=0; i<=N; i++) {
			if(i%2==0) {
				sum+=i;
			}
			 	
			}
		System.out.println("Sum of even numbers are : " + sum);
		
//		Question2
		int a=45;
		int b=78;
		int c=23;
		if(a>b && a>c) {
			System.out.println("larget number is:"+ a);
				
		}else if (b>a && b>c) {
			System.out.println("largest number is:"+ b);

		}else {
			System.out.println("larget number is:"+ c);
		}
		
//		Question 3
		int n=25;
		if(n>0) {
			System.out.println("number is positive");
		}else if(n<0) {
			System.out.println("number is negative");
		}else {
			System.out.println("number is Zero");
		}
		
//		Question 4
		int n1=4823;
		int count=0;
		while(n1!=0) {
			n1=n1/10;
			count++;
			
		}
		
		System.out.println("Count is :"+ count);
		
//		Question 5
		int n2=1234;
		int reverse=0;
		while(n2!=0) {
			int digit=n2%10;
			reverse=reverse*10+(digit);
			n2=n2/10;
		}
		System.out.println("reversed:" +reverse);
		
//		Question 6
		int n3=1221;
		reverse=0;
		while(n3!=0) {
			int digit1=n3%10;
			reverse=reverse*10+(digit1);
			n3=n3/10;
			
		}
		System.out.println("palindrome :" +reverse);
		
//		Question 7
	
		int n4=4523;
		sum=0;
		while(n4!=0) {
			int lastDigit=n4%10;
			sum =sum+lastDigit;
			n4=n4/10;
			
			
		}
			 
		System.out.println(sum);
		
		
//	Question 8
		int n5=234;
		int product=1;
		while(n5!=0) {
			int lastDigit=n5%10;
			product=product*lastDigit;
			n5=n5/10;
			
		}
		
		System.out.println(product);
		
		
		
//		Question 9
		int n6 = 153;
		int count1 = 0;
		int original = n6;

		while(n6 != 0) {
		    count1++;
		    n6 = n6 / 10;
		}

		
		n6 = original;

		int sum1 = 0;

		while(n6 != 0) {
		    int lastDigit = n6 % 10;
		    int power = 1;

		    for(int i = 1; i <= count1; i++) {
		        power = power * lastDigit;
		    }

		    sum1 = sum1 + power;
		    n6 = n6 / 10;
		}

		
		if(sum1 == original) {
		    System.out.println("Armstrong number");
		} else {
		    System.out.println("Not Armstrong number");
		}
		
//	370	
		
		int n7 = 370;
		int count2 = 0;
		int original1 = n7;

		while(n7 != 0) {
		    count2++;
		    n7 = n7 / 10;
		}

		
		n7 = original1;

		int sum2 = 0;

		while(n7 != 0) {
		    int lastDigit = n7 % 10;
		    int power = 1;

		    for(int i = 1; i <= count2; i++) {
		        power = power * lastDigit;
		    }

		    sum2 = sum2 + power;
		    n7 = n7 / 10;
		}

		
		if(sum2 == original1) {
		    System.out.println("Armstrong number");
		} else {
		    System.out.println("Not Armstrong number");
		}
		
//	123	
		
		int n8 = 123;
		int count3 = 0;
		int original2 = n8;

		while(n8 != 0) {
		    count3++;
		    n8 = n8 / 10;
		}

		
		n8 = original2;

		int sum3 = 0;

		while(n8 != 0) {
		    int lastDigit = n8 % 10;
		    int power = 1;

		    for(int i = 1; i <= count3; i++) {
		        power = power * lastDigit;
		    }

		    sum3 = sum3 + power;
		    n8 = n8 / 10;
		}

		
		if(sum3 == original2) {
		    System.out.println("Armstrong number");
		} else {
		    System.out.println("Not Armstrong number");
		}
		
		
		
//	Question10
		
		int n9=17;
		boolean isPrime=true;
		for(int i=2;i<n9;i++) {
			if(n9%i==0) {
				isPrime=false;
			}
			
		}
		
		if(isPrime) {
			System.out.println("it is prime number");
		}else {
			System.out.println("it is not prime number");
		}
		
		int n11=15;
		boolean isPrime2=true;
		for(int i=2;i<n11;i++) {
			if (n11 % i == 0) {
		        isPrime2 = false;
		        break;
		    }
			
		}
		if(isPrime2) {
			System.out.println("it is prime number");
		}else {
			System.out.println("it is not prime number");
		}
		
		
		
//		Question 11
		int n10=20;
		
		for(int i=2;i<=n10;i++) {
			boolean isPrime1=true;
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					isPrime1=false;
					break;
				}
			}
			if(isPrime1 ) {
				System.out.println("prime numbers are"+ " "+ i + "");
			
			}
		
		
		}
		
	}
}
	

	
		
		

	



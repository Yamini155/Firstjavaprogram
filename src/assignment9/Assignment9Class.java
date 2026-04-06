package assignment9;

public class Assignment9Class {

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
	
		
			 
			
		}
	

	
		
		

	}



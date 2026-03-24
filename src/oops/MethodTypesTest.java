package oops;

public class MethodTypesTest {
//	No parameter and No Return
void printnumbers() {
	for(int i=1;i<=5;i++) {
		System.out.println(i);
	}	
}

//No parameter,with return
int fixedNumber() {
	int number=100;
	return number;
	
}

// with parameters,no return
 void printTable(int num) {
	  for(int i=1;i<=10;i++) {
		  System.out.println("5 * " + i + "=" + num*i);
	  }
 }
 
// with parameters with return
 int maxNumber(int a, int b) {
	    return (a > b) ? a : b;
	}
	


 
 

}

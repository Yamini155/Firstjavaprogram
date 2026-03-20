package p3;

public class ArthmeticTest {

	public static void main(String[] args) {
		
//		question 1
		int notebooks=3;
		int priceOfNoteBooks=45;
		int total=notebooks*priceOfNoteBooks;
		System.out.println("total amount is :" + total);
		
//		question 2
		
		int students=35;
		int groupSize=6;
		int totalGroups=students/groupSize;
		int remainingStudents=students%groupSize;
				
		System.out.println("Total groups of students :"  + " " +   totalGroups);
		System.out.println("left over students :"  + " " + remainingStudents);
		
//		question 3
		
		
		int birthyear=1991;
		int currentYear=2026;
		int currentAge=currentYear-birthyear;
		System.out.println("my age is :" + " " + currentAge);

	}

}

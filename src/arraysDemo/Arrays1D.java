package arraysDemo;

public class Arrays1D {


	public static void main(String[] args) {
		int[] marks= {78,92,55,88,46,73};
		
		for (int i=0;i<marks.length;i++) {
			System.out.println("Student Marks :" + marks[i]);
			
		};
		

//			total marks calculation
		int total=0;
		for(int i=0; i<marks.length;i++) {
			total +=marks[i];
			
		}
		System.out.println("Total Marks: " + total );
		
		
//		average calculation
		for(int i=0;i<marks.length;i++) {
			
		}
		double average= total/marks.length;
		System.out.println("Average marks :" + average);
		
//		score above 75
		int count=0;
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>75) {
				count++;
				
			}
		}
		System.out.println("Score Above 75 is :" + count );
		
//		Highest marks
		
		int highest=marks[0];
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>highest) {
				highest=marks[i];
			}
			
			
		}
		System.out.println("Highest marks is :" + highest);
		
//		lowest salary
		int lowest=marks[0];
		for (int i=0;i<marks.length;i++) {
			if(marks[i]<lowest) {
				lowest=marks[i];
			}
			
		}
		System.out.println("Lowest salary is:" + lowest);

		
		   
		
			
		};
		
		
	}

 
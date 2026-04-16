package assignment10;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListClass {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
//		Question 1
		
			for(int i=1;i<=5;i++) {
				 System.out.print("Student " + i + ": ");
				int num=sc.nextInt();
				marks.add(num);	
				
			}
			
//Question 2
			for(int i:marks) {
				System.out.println(i);
			}
				
		
//		Question 3
	
		 System.out.print("Enter new mark to insert at index 2: ");
			 int newMark = sc.nextInt();
	         marks.add(2, newMark);
         System.out.println("Updated marks:");
         for (int i : marks) {
             System.out.println(i);
         }
         
//     Question 4
         
         System.out.print("Update the marks at index 0 :");
         int updMark= sc.nextInt();
         marks.set(0,updMark);
         System.out.println("Edited Marks ");
         for(int i:marks) {
        	 System.out.println(i);
         }
         
//    Question 5
         System.out.println("Before removing student at index 3:");
         for (int i = 0; i < marks.size(); i++) {
             System.out.println("Index " + i + " -> " + marks.get(i));
         }
         System.out.println("After removing student at index 3 :");
         if(marks.size()>3) {
        	 marks.remove(3);
        	 
         }else {
        	 System.out.println("Index 3 not availabe");
        	 
         }
         
         for(int i:marks) {
        	 System.out.println(i);
         }
     
         
//  Question 6
      System.out.print("Searched marks :"); 
     if(marks.contains(75)) {
    	 System.out.println("Found");
     }else {
    	 System.out.println("Not Found");
     }
     
     
//     Question 7
     
     
     
     
         
         sc.close();
     
		
		
		}
		
	
		
		

	}

	


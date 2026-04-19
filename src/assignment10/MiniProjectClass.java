package assignment10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class MiniProjectClass {

	public static void main(String[] args) {
		ArrayList<String> bookTitles = new ArrayList<>();
		bookTitles.add("Clean Code");
		bookTitles.add("The Alchemist");
		bookTitles.add("Atomic Habits");
		bookTitles.add("Effective Java");
		bookTitles.add("Sapiens");
		bookTitles.add("The Great Gatsby");
		System.out.println("====library catalog======:");
		for(String title:bookTitles) {
			
			System.out.println(title);
			
		}
		
//		searching and removing
		System.out.println("==searching and removing==");
		
		System.out.println("Search book: " + bookTitles.contains("Sapiens"));
		System.out.println("remove book :" +bookTitles.remove("Sapiens") );
		
//		after removing
		System.out.println("==After removing==");
          for(String title:bookTitles) {
			
			System.out.println(title);
			
		}
          
//          summary
          System.out.println("Total books :"+ bookTitles.size());
			
		
//		Question 2
		LinkedHashSet<String> uniqueGenres = new LinkedHashSet<>();
		
		uniqueGenres.add("Technology");
		uniqueGenres.add("Fiction");
		uniqueGenres.add("Self-Help");
		uniqueGenres.add("Technology");
		uniqueGenres.add("Non-Fiction");
		uniqueGenres.add("Fiction");
		
		System.out.println("==== Unique Genres =====");
		
		for(String genre:uniqueGenres) {
			System.out.println(genre);
		}
		
//		searching and removing
		System.out.println("==searching and removing==");
		System.out.println("Search genre: " + uniqueGenres.contains("Technology"));
		System.out.println("remove genre :" +uniqueGenres.remove("Technology") );
		
//		after removing
		System.out.println("after removing");
		for(String genre:uniqueGenres) {
			System.out.println(genre);
		}
		
//      summary
      System.out.println("Total genres :"+ uniqueGenres.size());
		
		
//		Question 3
		HashMap<String,String> bookTitle = new HashMap<>();
		
		bookTitle.put("Clean Code", "Robert C. Martin");
		bookTitle.put("The Alchemist", "Paulo Coelho");
		bookTitle.put("Atomic Habits", "James Clear");
		bookTitle.put("Effective Java", "Joshua Bloch");
		bookTitle.put("Sapiens", "Yuval Noah Harari");
		bookTitle.put("The Great Gatsby", "F. Scott Fitzgerald");
		
		System.out.println("===Author Look by title====");
		
		
		for(String title:bookTitle.keySet()) {
			System.out.println(title + "->" +bookTitle.get(title));
		}
		
//		searching and removing
		System.out.println("==searching and removing==");
		System.out.println("Search title: " + bookTitle.containsKey("Effective Java"));
		System.out.println("remove title :" +bookTitle.remove("Effective Java") );
		
//		after removing
		System.out.println("==after removing===");
		for(String title:bookTitle.keySet()) {
			System.out.println(title + "->" +bookTitle.get(title));
		}
		
//      summary
      System.out.println("Total mapped entries :"+ bookTitle.size());
      
      
//		Question 6
		HashMap<String,String> books = new HashMap<>();
		  books.put("Clean Code", "Robert C. Martin");
	       books.put("The Alchemist", "Paulo Coelho");
	        books.put("Atomic Habits", "James Clear");

	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter book title: ");
	        String title = sc.nextLine();

	        if (books.containsKey(title)) {
	            System.out.println("Author: " + books.get(title));
	        } else {
	            System.out.println("Book not found");
	        }
	        
	        sc.close();
    
	        
	        
	        
	}


}

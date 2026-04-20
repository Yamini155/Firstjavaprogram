package assignment10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
class ProjectLibrary{
	
    static ArrayList<String> bookTitles = new ArrayList<>();
	static LinkedHashSet<String> uniqueGenres = new LinkedHashSet<>();
	HashMap<String,String> bookTitle = new HashMap<>();
	
	
public static void displayCatalog() {
		System.out.println("====library catalog======:");
		for(String title:bookTitles) {
			System.out.println(title);
			
		}
	}

public static void displayGeners() {
	System.out.println("==== Unique Genres =====");
	
	for(String genre:uniqueGenres) {
		System.out.println(genre);
	}
		
	}

   void authorLookup() {
	System.out.println("===Author Look by title====");
	
	
	for(String title:bookTitle.keySet()) {
		System.out.println(title + "->" +bookTitle.get(title));
	}
}
 void searchBook(String title) {
	  if (bookTitle.containsKey(title)) {
          System.out.println("Author: " + bookTitle.get(title));
      } else {
          System.out.println("Book not found");
      }
}

 void removeBook(String title) {
	  if (bookTitle.containsKey(title)) {
        System.out.println("Author: " + bookTitle.remove(title));
    } else {
        System.out.println("Book not found");
    }
	  
	  if (bookTitles.contains(title)) {
	        System.out.println("Author: " + bookTitles.remove(title));
	    } else {
	        System.out.println("Book not found");
	    } 
}
 
 public void printSummary() {
	    System.out.println("Total books (ArrayList): " + bookTitles.size());
	    System.out.println("Unique genres (Set): " + uniqueGenres.size());
	    System.out.println("Books in map (HashMap): " + bookTitle.size());
	}

	public void addBook(String title,String genre, String author) {
		bookTitles.add(title);
		uniqueGenres.add(genre);
		bookTitle.put(title, author);
		
		
		
	}
	
	
	
}
public class MiniProjectClass {

	public static void main(String[] args) {
		ProjectLibrary obj=new ProjectLibrary();
		obj.addBook("Clean Code", "Technology", "Robert C. Martin");
		obj.addBook("The Alchemist", "Fiction", "Paulo Coelho");
		obj.addBook("Atomic Habits", "Self-Help", "James Clear");
		obj.addBook("Effective Java", "Technology", "Joshua Bloch");
		obj.addBook("Sapiens", "Non-Fiction", "Yuval Noah Harari");
		obj.addBook("The Great Gatsby", "Fiction", "F. Scott Fitzgerald");
		 ProjectLibrary.displayCatalog();
		 ProjectLibrary.displayGeners();
		 obj.authorLookup();
		 obj.printSummary();
		

      
//		Question 6
		
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter book title: ");
	        String title = sc.nextLine();
	        obj.searchBook(title);
	        
	        System.out.print("remove book title: ");
	        String removeTitle = sc.nextLine();
	        obj.removeBook(removeTitle);
	    
	        sc.close();
    
	        
	        
	        
	}


}

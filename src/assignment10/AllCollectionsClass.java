package assignment10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class AllCollectionsClass {

	public static void main(String[] args) {	
	List<String> Qnum =new ArrayList<>();
	
//	Question 1
	
	Qnum.add("Q3");
	Qnum.add("Q1");
	Qnum.add("Q4");
	Qnum.add("Q1");
	Qnum.add("Q2");
	Qnum.add("Q3");
	Qnum.add("Q5");
	Qnum.add("Q2");

	for(String i:Qnum) {
		System.out.println(" Question number :" + " " +i);
	}
	System.out.println("Size:" + Qnum.size());
	
//	Question 2
	HashSet<String> Qnum1 =new HashSet<>();
	Qnum1.add("Q3");
	Qnum1.add("Q1");
	Qnum1.add("Q4");
	Qnum1.add("Q1");
	Qnum1.add("Q2");
	Qnum1.add("Q3");
	Qnum1.add("Q5");
	Qnum1.add("Q2");
	
	for(String i:Qnum1) {
		System.out.println("Question random order :" + i);
	}
	System.out.println("Size:" + Qnum1.size());
	
//	Question 3
	LinkedHashSet<String> Qnum2 = new LinkedHashSet<>();
	Qnum2.add("Q3");
	Qnum2.add("Q1");
	Qnum2.add("Q4");
	Qnum2.add("Q1");
	Qnum2.add("Q2");
	Qnum2.add("Q3");
	Qnum2.add("Q5");
	Qnum2.add("Q2");
	for(String i:Qnum2) {
		System.out.println("Question insertion order :" + i);
	}
	System.out.println("Size:" + Qnum2.size());
	
//	Question 5
	System.out.println("Contains Q3:" +Qnum2.contains("Q3"));
	
//	Question 6
	System.out.println("Removes Q4:" +Qnum2.remove("Q4"));
	for(String i:Qnum2) {
		System.out.println("Question insertion order :" + i);
	}
	
	System.out.println("Size:" + Qnum2.size());
	
	
//	Question 4
	TreeSet<String> Qnum3 = new TreeSet<>();
	Qnum3.add("Q3");
	Qnum3.add("Q1");
	Qnum3.add("Q4");
	Qnum3.add("Q1");
	Qnum3.add("Q2");
	Qnum3.add("Q3");
	Qnum3.add("Q5");
	Qnum3.add("Q2");
	for(String i:Qnum3) {
		System.out.println("Question sorted order :" + i);
	}
	System.out.println("Size:" + Qnum3.size());
	
//	Comparison
	if (Qnum1.size() == Qnum2.size() && Qnum2.size() == Qnum3.size() && Qnum.size()==Qnum1.size() ) {
	    System.out.println("All sets have same size");
	} else {
	    System.out.println("Sizes are different");
	}

	}

}

package assignment10;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap<Integer,String> m1 = new HashMap<>();
		
//		Question 1
		
		m1.put(101,"Ravi");
		m1.put(102,"Priya");
		m1.put(103,"Arjun");
		m1.put(104,"Sneha");
		m1.put(105,"Kiran");
		
		System.out.println(m1);

		
//		Question 2
		for (Map.Entry<Integer, String> entry : m1.entrySet()) {
		    System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
		}
		
//		Question 3
		boolean value=m1.containsKey(103);
		System.out.println("contains 103 :" + value);
		if (value) {
		    System.out.println("Name is: " + m1.get(103));
		}else {
			System.out.println("no name found");
		}
		
//		Question 4
		m1.put(102,"Priya Sharma");
		System.out.println(m1);
		
		
//Question 5
	boolean result=	m1.remove(105,"Kiran");
		System.out.println("removed from data is: " +result);
		if(result) {
			System.out.println("105 is removed");
		}else {
			System.out.println("105 is not removed");
		}
		
//		Question 6
		boolean name = m1.containsValue("Arjun");
		System.out.println("Name is : " + name);
		
//		Question 7
//		to get the key's
		
		for(Integer i:m1.keySet()) {
			System.out.println("key :" + i);
		}
		
		
//		to get the values
		
		for(String i:m1.values()) {
			System.out.println("value :"+ i);
		}
		
//		Question 8
		
		int count= m1.size();
		System.out.println("Total head count is :" + count);
		
		
	}

}

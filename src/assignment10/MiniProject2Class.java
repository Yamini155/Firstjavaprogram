package assignment10;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

class ProjectEmployee{
	List <String> eNames= new ArrayList<>();
	static LinkedHashSet <String> dNames = new LinkedHashSet<>();
	LinkedHashMap<String, Double> employeeSalaries = new LinkedHashMap<>();

	
	
	
	public void employeeDetails(String name, String dept, double salary) {
		eNames.add(name);
		dNames.add(dept);
		employeeSalaries.put(name, salary);
			
	}
	
	public void displayEmployees() {
		System.out.println("------Employee names----");
		for(String name:eNames) {
			System.out.println(name);
		}
	}
	
	public static void displayDepartments() {
		System.out.println("-----Departments are----");
		for(String dept:dNames) {
			System.out.println(dept);
			
		}
	}
	
	
	public void displaySalaries() {
		System.out.println("-----salaries-----");
		for(String name:employeeSalaries.keySet()) {
			System.out.println(name + "=>"+ employeeSalaries.get(name));
			
		}
	}
	
	
	public void searchEmployee(String name) {
		if(eNames.contains(name)) {
			System.out.println("employee details :" +employeeSalaries.get(name));
			
		}else {
			System.out.println("employee name not found");
		}
		
	}
	
	public void removeEmployee(String name) {
	
		if(eNames.contains(name) && employeeSalaries.containsKey(name) ) {
		 eNames.remove(name);
		 employeeSalaries.remove(name);
		 System.out.println("Removed Employee :" + name);
	
		}else {
			System.out.println("Employee not found");
		}
	}
	
	public void total() {
		System.out.println("no.of employees :" + eNames.size());
		System.out.println("no.of departments :" + dNames.size());
		
	}

	
	
}

public class MiniProject2Class {

	public static void main(String[] args) {
		ProjectEmployee obj = new ProjectEmployee();
		obj.employeeDetails("Yamini", "Admin", 10000.0);
		obj.employeeDetails("Priyanka", "IT", 20000.0);
		obj.employeeDetails("Akshita", "Finance", 30000.0);
		obj.employeeDetails("Alekya", "Admin", 40000.0);
		obj.employeeDetails("Jyothsna", "HR", 50000.0);
		obj.employeeDetails("Leela", "IT", 60000.0);
		obj.displayEmployees();
		ProjectEmployee.displayDepartments();
		obj.displaySalaries();
		obj.removeEmployee("Yamini");
		obj.total();
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Employee name:");
		String name= sc.nextLine();
		obj.searchEmployee(name);
		sc.close();
	

	}

}

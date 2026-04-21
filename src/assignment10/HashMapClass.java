package assignment10;

import java.util.HashMap;
import java.util.Map;

class employeeProject{
	
	static HashMap<Integer,String> employeeMap = new HashMap<>();
	
	public void employeesList(int empId, String empName ) {
		
		employeeMap.put(empId, empName);
	}
	
	 public void displayEmpDetails() {
		 for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
		    System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
			}
     }
	 
	 public void searchEmployee() {
		
		 if (employeeMap.containsKey(103)) {
			String name= employeeMap.get(103);
			 System.out.println("Name is :" + " " + name);
				 
			 
		 }else {
			 System.out.println("name not found");
		 }
		 
	 }
	 
	 public void updateEmployee(String name) {
		
		 if(employeeMap.containsKey(102)) {
			 employeeMap.put(102, name);
			 System.out.println("name update as :" + name);
		 }else {
			 System.out.println("employee 102 not found");
		 }
		 
	 }
	 public void removeEmployee() {
		    if (employeeMap.containsKey(105)) {
		        employeeMap.remove(105);
		        System.out.println("Employee 105 removed successfully");
		    } else {
		        System.out.println("Employee 105 not found");
		    }
		}
	 
	 public void checkingEmployee() {
		 if(employeeMap.containsValue("Arjun")) {
			 System.out.println("employee Arjun exists");
		 }else {
			 System.out.println("employee Arjun does not exists");
		 }
	 }
	 
	 public static void allEmployees() {
		 System.out.println("---employee Id's---");
		 for(int i:employeeMap.keySet()) {
			 System.out.println("key :" +  i);
		 }
		 System.out.println("---employee value's---");
		 for(String i:employeeMap.values()) {
			 System.out.println("values :" +  i);
		 }
		  
	 }
	 
	 public void totalEmployees() {
		 System.out.println("Total headcount :" + employeeMap.size());
	 }
	
}


public class HashMapClass {

	public static void main(String[] args) {
		employeeProject obj=new employeeProject();
		obj.employeesList(101,"Ravi");
		obj.employeesList(102,"Priya");
		obj.employeesList(103,"Arjun");
		obj.employeesList(104,"Sneha");
		obj.employeesList(105,"Kiran");
		obj.displayEmpDetails();
		obj.searchEmployee();
		obj.updateEmployee("Priya Sharma");
		obj.removeEmployee();
		obj.checkingEmployee();
		employeeProject.allEmployees();
		obj.totalEmployees();
		
	}

}

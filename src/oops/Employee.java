package oops;

public class Employee {
  String name;
  int EmployeeId;
  int Salary;
  Employee(String name, int EmployeeId,int Salary){
	  this.name=name;
	  this.EmployeeId=EmployeeId;
	  this.Salary=Salary;
  }
  
  void display() {
	  System.out.println(name + " " + EmployeeId + " " + Salary);
  }
}

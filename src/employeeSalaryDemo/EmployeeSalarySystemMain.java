package employeeSalaryDemo;
class Employee{
	private String name;
	private int baseSalary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	int calculateSalary() {
	   
	    return baseSalary;
	}
	
}
class FullTimeEmployee extends Employee {
    int calculateSalary() {
        int PF = 1000;
        return getBaseSalary() + PF;
    }
}
class Intern extends Employee{
	  int calculateSalary() {
		  return getBaseSalary();
		
	}
}


public class EmployeeSalarySystemMain {

	public static void main(String[] args) {
		FullTimeEmployee emp1= new FullTimeEmployee();
		emp1.setName("Yamini");
		
		emp1.setBaseSalary(10000);
		
		 Intern emp2 = new Intern();
	        emp2.setName("Sita");
	        emp2.setBaseSalary(5000);

	        System.out.println("Full Time Salary: " + emp1.calculateSalary());
	        System.out.println("Intern Salary: " + emp2.calculateSalary());
	        System.out.println(emp1.getName());
	        System.out.println(emp2.getName());
	        
		}

	}



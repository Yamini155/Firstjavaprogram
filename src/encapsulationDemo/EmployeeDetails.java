package encapsulationDemo;

public class EmployeeDetails {
	private String name;
	 private int EmployeeId;
	  private int Salary;
	  public String getName() {
		  return name;
	  }
	  public void setName(String name) {
		  this.name = name;
	  }
	  public int getEmployeeId() {
		  return EmployeeId;
	  }
	  public void setEmployeeId(int employeeId) {
		 this.EmployeeId = employeeId;
	  }
	  public int getSalary() {
		  return Salary;
	  }
	  public void setSalary(int salary) {
		  
		  if(salary>=0 && salary<=100) {
			  this.Salary = salary;
		  }else  {
			  System.out.println("error in salary");
		  }
		  
	  }

}

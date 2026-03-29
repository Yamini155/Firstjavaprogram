package encapsulationDemo;

public class EmployeeDetailsMain {

	public static void main(String[] args) {
		EmployeeDetails obj1= new EmployeeDetails();
		obj1.setName("Yamini");
		obj1.setEmployeeId(1);
		obj1.setSalary(150);
		
		System.out.println(obj1.getName());
		System.out.println(obj1.getEmployeeId());
		System.out.println(obj1.getSalary());
		
	}

}

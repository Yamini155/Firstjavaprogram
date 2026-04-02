package multilevelDemo;
class person{
	public String name;
	public int age;
	
	person (String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	void display(){
		System.out.println("Name :" + name );
		System.out.println("age :" +  age);
		
	}
}

class employee extends person{
	String company;
	int salary;
	employee(String name,int age,String company, int salary) {
		super(name,age);
		this.company=company;
		this.salary=salary;
		
	}
	void displayEmployeeInfo() {
		System.out.println("Company :" + company);
		System.out.println("salary :" +  salary);
	}
	
}

class manager extends employee{
	String department;
	int teamSize;
	
	manager(String name,int age,String company, int salary,String department, int teamSize) {
		super(name,age,company,salary);
		this.department=department;
		this.teamSize=teamSize;
		
	}
	
	void displayManagerInfo() {
		System.out.println("Department :"+ department+ " "+ teamSize);
		System.out.println("Teamsize :"+ teamSize);
	}
	
	
	
}

public class EmployeeMultilevel {

	public static void main(String[] args) {
		manager obj1= new manager("yamini",35,"Infosys", 35000, "QA Automation", 30);
		obj1.display();
		obj1.displayEmployeeInfo();
		obj1.displayManagerInfo();
	}

}

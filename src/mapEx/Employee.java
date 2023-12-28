package mapEx;

public class Employee {;

	int eid,salary;
	String name;
	
	public Employee(int eid, int salary, String name) {
		super();
		this.eid = eid;
		this.salary = salary;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", salary=" + salary + ", name=" + name + "]";
	}
	
	
	

}

package abstract_design_pattern;

public class Client {
	public static void main(String[] args) {
		// i want Android develper
		Employee employee = EmployeeFactory.getEmployee(new AndroidDevFactory());
		employee.name();
		
		Employee employee2 = EmployeeFactory.getEmployee(new WebDevFactory());
		employee2.name();
		
		Employee employee3 = EmployeeFactory.getEmployee(new ManagerFactory());
		employee3.name();
	}

}

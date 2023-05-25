package factory.design.pattern;

public class DeveloperClient {
	public static void main(String[] args) {
		Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
		 int salary = employee.salary();
		 System.out.println(salary);
		 
		 Employee employee2 = EmployeeFactory.getEmployee("WEB DEVELOPER");
		 System.out.println("Salary : " + employee2.salary());
	}

}

package abstract_design_pattern;

public class EmployeeFactory {
	
	//get Employee
	public static Employee getEmployee(EmployeeAbstractFactory factory) {
		return factory.createEmployee();
	}

}

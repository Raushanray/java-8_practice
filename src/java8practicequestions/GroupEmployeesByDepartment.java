package java8practicequestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Grouping by Criteria: Given a list of Employee objects (having name, department, and salary),
 *  write a Java 8 program to group employees by their department.
 */

class Employee{
	private String name;
	private String department;
	private double salary;
	
	
	public Employee(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public String getDepartment() {
		return department;
	}


	public double getSalary() {
		return salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

	
}


public class GroupEmployeesByDepartment {
	public static void main(String[] args) {
		
		  List<Employee> employees = Arrays.asList( new Employee("Ravi", "HR", 50000),
		  new Employee("Sumit", "Finance", 60000), new Employee("Aman", "HR", 55000),
		  new Employee("Mahesh", "Finance", 65000), new Employee("Sonu", "IT", 70000)
		  );
		  
		  Map<String, List<Employee>> employeesByDepartment =
		  employees.stream().collect(Collectors.groupingBy(Employee :: getDepartment));
		  
		  System.out.println("Employees grouped by department: ");
		  employeesByDepartment.forEach((department, employeeList) -> {
		  System.out.println(department +" : "+ employeeList);
		  });
		 
		
	}

}

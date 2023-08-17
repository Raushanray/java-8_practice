package new_collections_Questions;
/*
Question: Given a list of Employee objects, how would you find the employee with the highest salary
using Java 8 streams and lambda expressions?
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee {
	
	private String name;
	private double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
	
	public class HighestSalaryEmployee{
		public static void main(String[] args) {
			List<Employee> employees = new ArrayList<>();
			employees.add(new Employee("Ravi",50000));
			employees.add(new Employee("Rahul",100000));
			employees.add(new Employee("sumit",60000));
			employees.add(new Employee("aman",200000));
			employees.add(new Employee("tannu",250000));
			employees.add(new Employee("khushi",350000));
			
		
			Optional<Employee> highestSalaryEmployee = employees.stream().max(Comparator.comparingDouble(Employee :: getSalary));
			if (highestSalaryEmployee.isPresent()) {
				Employee employee = highestSalaryEmployee.get();
				System.out.println("Employee with the highest salary: " + employee.getName() + "  - " + employee.getSalary());
			}else {
				System.out.println("No employee found!!");
			}
		}
	}
	

 
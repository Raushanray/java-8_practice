package real_time_queries;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class QueriesTest {
	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(111, "Ram", 34, "male", "Hr", 2016, 200000));
		employeeList.add(new Employee(222, "Shyam", 44, "male", "Developer", 2017, 20000));
		employeeList.add(new Employee(333, "Tannu", 24, "female", "manager", 2020, 200000));
		employeeList.add(new Employee(444, "Hanuman", 23, "male", "Tec-Manager", 2016, 100000));
		employeeList.add(new Employee(555, "Sita", 20, "female", "Deployment", 2015, 25000));
		employeeList.add(new Employee(666, "Moni", 30, "female", "Product Development", 2018, 200000));
		employeeList.add(new Employee(777, "pawan", 31, "male", "Product Development", 2019, 205000));
		employeeList.add(new Employee(888, "Pardeep", 45, "male", "Product manager", 2014, 250000));
		employeeList.add(new Employee(999, "keshav", 29, "male", "DB", 2019, 150000));
		employeeList.add(new Employee(123, "Kunal", 22, "male", "Product manager", 2020, 100000));
		employeeList.add(new Employee(223, "Mahesh", 42, "male", "Developer", 2021, 150000));
		employeeList.add(new Employee(125, "Radha", 60, "female", "Bec-dev", 2022, 260000));
		employeeList.add(new Employee(136, "Manoj", 33, "male", "Deployment", 2018, 1200000));
		employeeList.add(new Employee(145, "Saroj", 32, "male", "DB", 2016, 210000));
		employeeList.add(new Employee(118, "Rina", 35, "female", "Hr", 2017, 140000));
		employeeList.add(new Employee(105, "Ravi", 26, "male", "manager", 2019, 150000));

		// 1st Queries
		// How many male and female employees are there in the organization?
		/*
		 * For queries such as above where you need to group the input elements, use the
		 * Collectors.groupingBy() method. In this query, we use Collectors.groupingBy()
		 * method which takes two arguments. We pass Employee::getGender as first
		 * argument which groups the input elements based on gender and
		 * Collectors.counting() as second argument which counts the number of entries
		 * in each group.
		 */
		Map<String, Long> noOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out
				.println("In this organization Total no of male and female employees = " + noOfMaleAndFemaleEmployees);
		System.out.println("----------------------------------------");
		// 2nd Queries
		// Print the name of all departments in the organization?
		/*
		 * Use distinct() method after calling map(Employee::getDepartment) on the
		 * stream. It will return unique departments.
		 */

		System.out.println("All Department list.........");
		employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

		System.out.println("----------------------------------------");

	}

}

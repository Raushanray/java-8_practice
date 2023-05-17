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
		// 3rd Queries
		// What is the average age of male and female employees?
		/*
		 * Use same method as query 3.1 but pass
		 * Collectors.averagingInt(Employee::getAge) as the second argument to
		 * Collectors.groupingBy().
		 */

		Map<String, Double> avgAgeOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println("the average age of male and female employees" + avgAgeOfMaleAndFemaleEmployees);
		System.out.println("----------------------------------------");

		// 4th Queries
		// Get the details of highest paid employee in the organization?
		/*
		 * Use Collectors.maxBy() method which returns maximum element wrapped in an
		 * Optional object based on supplied Comparator.
		 */
		Optional<Employee> highestPaidEmployeeWrapper = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
//				System.out.println("The highest paid employee in the organization and its details " + highestPaidEmployee); // use this for print all details in single line
		System.out.println("The highest paid employee in the organization ");
		System.out.println("===================details===========");
		System.out.println("ID- " + highestPaidEmployee.getId());
		System.out.println("Name- " + highestPaidEmployee.getName());
		System.out.println("Age- " + highestPaidEmployee.getAge());
		System.out.println("Gender- " + highestPaidEmployee.getGender());
		System.out.println("Department- " + highestPaidEmployee.getDepartment());
		System.out.println("Year of Joining- " + highestPaidEmployee.getYearOfJoining());
		System.out.println("Salary- " + highestPaidEmployee.getSalary());

		System.out.println("---------------------------------------------------");

		// 5th Queries
		// Get the names of all employees who have joined after 2017?
		/*
		 * For such queries which require filtering of input elements, use
		 * Stream.filter() method which filters input elements according to supplied
		 * Predicate. */
		 System.out.println("The Names of all employees who have joined after 2017");
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2017).map(Employee::getName)
				.forEach(System.out::println);

		System.out.println("------------------------------------");

		// 6th Queries
		// Count the number of employees in each department?
		/*
		 * This query is same as query 3.1 but here we are grouping the elements by
		 * department.
		 */

		System.out.println("the number of employees in each department ");

		Map<String, Long> employeeCountByDepartment = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		Set<Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		System.out.println("---------------------------------------");

		// 7th Queries
		// What is the average salary of each department?
		/*
		 * Use the same method as in the above query 3.6, but here pass
		 * Collectors.averagingDouble(Employee::getSalary) as second argument to
		 * Collectors.groupingBy() method.
		 */
		System.out.println("The average salary of each department");
		Map<String, Double> avgSalaryOfDepartments = employeeList.stream()
				                          .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		
		Set<Entry<String, Double>> entrySet2 = avgSalaryOfDepartments.entrySet();
		for (Entry<String, Double> entry : entrySet2) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println("-------------------------------------");

		// 8th Queries
		// Get the details of youngest male employee in the Product Development department?
		/*
		 * For this query, use Stream.filter() method to filter male employees in
		 * product development department and to find youngest among them, use
		 * Stream.min() method.
		 */
		
		Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper = employeeList.stream()
		            .filter(e -> e.getGender().equalsIgnoreCase("Male") && e.getDepartment().equalsIgnoreCase("Product Development"))
		            .min(Comparator.comparing(Employee::getAge));
		Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();
		
		System.out.println("The details of youngest male employee in the hr department :" );
		
		System.out.println("ID- " + youngestMaleEmployeeInProductDevelopment.getId());
		System.out.println("Name- " + youngestMaleEmployeeInProductDevelopment.getName());
		System.out.println("Age- " + youngestMaleEmployeeInProductDevelopment.getAge());
		System.out.println("Gender- " + youngestMaleEmployeeInProductDevelopment.getGender());
		System.out.println("Department- " + youngestMaleEmployeeInProductDevelopment.getDepartment());
		System.out.println("Year of Joining- " + youngestMaleEmployeeInProductDevelopment.getYearOfJoining());
		System.out.println("Salary- " + youngestMaleEmployeeInProductDevelopment.getSalary());
		
		System.out.println("------------------------------------------------");

		
		//9th Queries
//		 Who has the most working experience in the organization?
		/*
		 * For this query, sort employeeList by yearOfJoining in natural order and first
		 * employee will have most working experience in the organization. To solve this
		 * query, we will be using sorted() and findFirst() methods of Stream.
		 */
		
		Optional<Employee> seniorMostEmployeeWrapper = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		Employee seniorMostEmployee  = seniorMostEmployeeWrapper.get();
		System.out.println("Senior Most Employee Details :");
		System.out.println("ID- " + seniorMostEmployee .getId());
		System.out.println("Name- " + seniorMostEmployee .getName());
		System.out.println("Age- " + seniorMostEmployee .getAge());
		System.out.println("Gender- " + seniorMostEmployee .getGender());
		System.out.println("Department- " + seniorMostEmployee .getDepartment());
		System.out.println("Year of Joining- " + seniorMostEmployee .getYearOfJoining());
		System.out.println("Salary- " + seniorMostEmployee .getSalary());
		
		System.out.println("------------------------------------------------");

		// 10th Queries
		// How many male and female employees are there in the manager team?
		/*
		 * This query is same as query 3.1, but here use filter() method to filter sales
		 * and marketing employees.
		 */
		Map<String, Long> countMaleFemaleEmployeesInManager = employeeList.stream()
				.filter(e -> e.getDepartment() == "manager")
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println("There in the manager team :" + countMaleFemaleEmployeesInManager);

		System.out.println("----------------------------------------");

		// 11th Queries
		// What is the average salary of male and female employees?
		/*
		 * This query is same as query 3.3 where you have found average age of male and
		 * female employees. Here, we will be finding average salary of male and female
		 * employees.
		 */
		Map<String, Double> avgSalaryOfMaleAndFemaleEmployees = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println("the average salary of male and female employees : " + avgSalaryOfMaleAndFemaleEmployees);

		System.out.println("-----------------------------------");
		
		
		
		
	
	}

}

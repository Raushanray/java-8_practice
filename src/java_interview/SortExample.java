package java_interview;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {
	public static void main(String[] args) {

//		ArrayList<Integer> marks = new ArrayList<>();
//		marks.add(12);
//		marks.add(5);
//		marks.add(8);
//		System.out.println(marks);
//		Collections.sort(marks);
//		System.out.println(marks);
		
		//now useing comparable Interface for sorting the data of employee class...
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee("108", "Pardeep", "h.r", 36));
		empList.add(new Employee("102", "Santosh", "Manager", 35));
		empList.add(new Employee("106", "Pardeep", "Asst Manager", 25));
		empList.add(new Employee("104", "Ashok", "Store manager", 39));
		empList.add(new Employee("109", "Santosh", "Generak manager", 29));
		
		ArrayList<Employee> empList1 = new ArrayList<Employee>(empList);
		
		System.out.println(empList);
		//output in same order...
		Collections.sort(empList , new AgeComparetor());
		System.out.println("+++++++++Sort by age of employee++++++++++");
		System.out.println(empList);
		
		Collections.sort(empList1 , new NameComparetor());
		System.out.println("+++++++++Sort by name of employee++++++++++");
		System.out.println(empList1);

	}

}

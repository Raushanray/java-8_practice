package lambda.exp.program.list;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IterateOverAList {
	public static void main(String[] args) {
		// 1. Iterate over a List and print each element:
		List<String> names = Arrays.asList("Raushan ", " Ravi", " Sumit", " Amit");
		names.forEach(System.out::println);

		// Filter elements in a List based on a condition and collect them into a new
		// List of even nu:
		List<Integer> numbers = Arrays.asList(2, 45, 86, 32, 14, 75, 16, 8);
		List<Integer> evenNumber = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
		System.out.println("print even number :" + evenNumber);
		
		//Sort a List of strings alphabetically:
		List<String> name = Arrays.asList("Raushan", "Ravi", "Sumit", "Amit","pardeep","RaJu");
		name.sort(String::compareToIgnoreCase);
		System.out.println("sorted name");
		for (String sortedName : name) {
			System.out.println(sortedName);
			
			
		}
		//Map elements in a List to their squared values and collect them into a new List:
		List<Integer> num = Arrays.asList(5,6,4,8,9);
		List<Integer> squareNUm = num.stream().map(n-> n*n).collect(Collectors.toList());
		System.out.println(squareNUm);
		
		//Group elements in a List based on their length:
		List<String> nameList = Arrays.asList("Raushan", "Ravi", "Sumit", "Amit");
		Map<Integer, List<String>> newList = nameList.stream().collect(Collectors.groupingBy(String :: length));
		System.out.println(newList);
		
		//Find the maximum value in a List of integers:
		List<Integer> numLst = Arrays.asList(21,32,6,2,78,45,65);
		Integer maxNum = numLst.stream().max(Integer :: compareTo).orElse(0);
		System.out.println(maxNum);
		
		//Calculate the sum of all numbers in a List using reduce:
		List<Integer> numLst1 = Arrays.asList(2,5,6,4,8,1);
		Integer sum = numLst1.stream().reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		
		//Use method references with lambdas to print elements:
		List<String> namesLst = Arrays.asList("Raushan", "Ravi", "Sumit", "Amit","pardeep","RaJu");
		namesLst.forEach(System.out::println);
		
	}
}

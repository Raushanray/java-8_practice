package java8practicequestions;

/*
 * Q> Filter Strings by Length :Given a list of strings, 
 * write a Java 8 program to filter out strings whose length is greater than a given value 'maxLength'.
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringsByLength {
	public static void main(String[] args) {
		List<String> lists = Arrays.asList("Banana", "Apple", "orange", "kiwi", "grape");
		int maxLenght = 5;
		
		List<String> filteredStrings = lists.stream().filter(str -> str.length() <= maxLenght).collect(Collectors.toList());
		System.out.println("Filtered strings: " + filteredStrings);
	}

}

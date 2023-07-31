package java_8_predicates_practices;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 * Write a Java 8 program that takes a list of strings as input and uses a predicate to filter out only the strings 
 * that start with a specific prefix. Then, return the filtered strings as a new list
 */

public class FilterStringsByPrefix {

	public static void main(String[] args) {
		List<String> stringLists = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "ackee");
		String prefix = "a";
		Predicate<String> startsWithPrefix = str -> str.startsWith(prefix);
		
		List<String> filteredStrings = stringLists.stream().filter(startsWithPrefix).collect(Collectors.toList());
		
		System.out.println("Strings that start with \"" + prefix + "\" : " + filteredStrings);
	}
}

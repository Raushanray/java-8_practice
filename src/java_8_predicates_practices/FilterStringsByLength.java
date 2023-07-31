package java_8_predicates_practices;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
 * Write a Java 8 program that takes a list of strings as input and uses a predicate to filter
 *  out only the strings that are of a specific length. Then, return the filtered strings as a new list.
 */
public class FilterStringsByLength {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana","orange","grape", "ackee");
		
		int targetLength = 5;
		Predicate<String> hasTargetLength = str -> str.length() == targetLength;
		
		List<String> filteredStrings = strings.stream().filter(hasTargetLength).collect(Collectors.toList());
		
		System.out.println("Strings of Length  \'" + targetLength + "\' :" + filteredStrings);
		
	}
}

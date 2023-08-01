package java_8_functions_practices;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


/*
 * Write a Java 8 program that takes a list of strings as input and uses a function to convert each string 
 * to its uppercase form. Then, return the list of uppercase strings as a new list.
 */
public class UppercaseStrings {
	public static void main(String[] args) {
	List<String> list = Arrays.asList("hello","khushbu","rani", "how","are","you");
	Function<String, String> toUppercaseFunctions = String :: toUpperCase;
	List<String> uppercaseStrings = list.stream().map(toUppercaseFunctions).collect(Collectors.toList());
	System.out.println("Uppercase Strings : " + uppercaseStrings);
	}

}

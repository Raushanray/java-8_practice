package java8practicequestions;

import java.util.Arrays;
/*
 * UserStream Manipulation: Given a list of strings,
 * write a Java 8 program to transform each string to uppercase and then concatenate them into a single string.
 */
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateUppercaseStrings {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("hello", "world", "java", "8", "streams");
		String concatenatedUppercaseString = strings.stream().map(String :: toUpperCase).collect(Collectors.joining());
		System.out.println("Concatenated Uppercase String: " + concatenatedUppercaseString);
	}

}

package java8practicequestions;

/*
 * Sorting with Lambdas:Write a Java 8 program to sort a list of strings in descending order of their lengths using lambda expressions.
 */
import java.util.Arrays;
import java.util.List;

public class SortStringsByLength {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Banana", "Apple", "orange", "kiwi", "grape");
		strings.sort((str1, str2) -> Integer.compare(str2.length(), str1.length()));
		System.out.println("Sorted strings by length (descending): " + strings);
	}

}

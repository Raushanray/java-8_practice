package java8practicequestions;

/*
 * Q> Sum of Even Numbers:Write a Java 8 program that takes a list of integers as input and returns the sum of all even numbers in the list.

 */

import java.util.Arrays;
import java.util.List;

public class SumOfAllEvenNumber {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,8,6,5,4,9,25,14);
		System.out.println("Even numbers :- ");
		numbers.stream().filter(n-> n % 2 ==0).forEach(System.out::println);
		int sumOfEvenNumbers = numbers.stream().filter(n -> n % 2 == 0).mapToInt(Integer :: intValue).sum();
		System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
	}

}

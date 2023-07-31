package java_8_predicates_practices;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Write a Java 8 program that takes a list of integers as input and uses a predicate to filter out only
 *  the even numbers from the list. Then, calculate the sum of these even numbers and return the result.
 */

public class SumOfEvenNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,6,9,5,8,7,4,12,36,16);
		
		Predicate<Integer> isEven = num -> num % 2 == 0;
		int sumOfEvenNumbers = numbers.stream().filter(isEven).mapToInt(Integer :: intValue).sum();
		System.out.println("Sum Of Even Numbers : "  + sumOfEvenNumbers); 
	}

}

package java8practicequestions;

/*
 * Sum of Squares of Integers: Given a list of integers, write a Java 8 program to calculate the sum of squares of all elements.
 */
import java.util.Arrays;
import java.util.List;

public class SumOfSquares {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,5,6,4,7);
		
		int sumOfSquares = numbers.stream().mapToInt(num -> num*num).sum();
		
		System.out.println("Sum of Squares : " + sumOfSquares);
	}
}

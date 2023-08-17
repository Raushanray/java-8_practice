package java8practicequestions;

/*
 *Q> Square of Odd Numbers:Given a list of integers,
 * write a Java 8 program to calculate the square of all odd numbers and return them as a list.
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SquareOfOddNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,5,3,1,7,9,13,11);
		System.out.println("Odd numbers :- ");
		numbers.stream().filter(num -> num % 2 != 0).forEach(System.out::println);
		List<Integer> squaresOfOddNumbers = numbers.stream().filter(num -> num % 2 != 0).map(num -> num * num).collect(Collectors.toList());
		System.out.println("Squares of odd numbers: " + squaresOfOddNumbers);
		
	}

}

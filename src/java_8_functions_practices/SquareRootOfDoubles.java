package java_8_functions_practices;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * Write a Java 8 program that takes a list of doubles as input and uses a function to calculate 
 * the square root of each double value. Then, return the list of square roots as a new list.
 */
public class SquareRootOfDoubles {

	public static void main(String[] args) {
		List<Double> numbers = Arrays.asList(4.0, 16.0, 9.0, 25.0);
		
		Function<Double, Double> squareRootFunction = Math :: sqrt;
		List<Double> squareRoots = numbers.stream().map(squareRootFunction).collect(Collectors.toList());
		System.out.println("Square Root Of Doubles : " + squareRoots);
	}
}

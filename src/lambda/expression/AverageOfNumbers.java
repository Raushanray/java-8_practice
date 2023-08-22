package lambda.expression;
/*
 * Find the average of all numbers from a list.
 */
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


public class AverageOfNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		OptionalDouble average =  clacutateAverage(numbers);
		
		if (average.isPresent()) {
			System.out.println("Average: " + average.getAsDouble());
		}
		else {
			System.out.println("list is empty..");
		}
	}

	private static OptionalDouble clacutateAverage(List<Integer> numbers) {
		
		return numbers.stream().mapToDouble(Double :: valueOf).average();
	}

}

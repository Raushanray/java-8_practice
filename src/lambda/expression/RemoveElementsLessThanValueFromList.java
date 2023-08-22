package lambda.expression;
/*
 * Remove elements from a list that are less than a given value.
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElementsLessThanValueFromList {
	public static void main(String[] args) {
		int minValue=10;
		List<Integer> numbers = Arrays.asList(10,2,35,1,45,12);
		List<Integer> filteredNumbers = numbers.stream().filter(num -> num >= minValue).collect(Collectors.toList());
		System.out.println("Remove Elements Less Than Value From List : " + filteredNumbers);
	}

}

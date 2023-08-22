package lambda.expression;
/*
 * Find the frequency of characters in a string.
 */
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
	public static void main(String[] args) {
		String input = "hello java";
		
		Map<Character, Long> charFrequency = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Character Frequency : " + charFrequency);
	}

}

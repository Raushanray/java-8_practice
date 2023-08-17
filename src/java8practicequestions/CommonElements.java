package java8practicequestions;

/*
 * Find Common Elements: Write a Java 8 program to find the common elements between two lists of integers.
 */
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(2,6,7,9,3,4);
		List<Integer> list2 = Arrays.asList(2,6,76,91,8,4);
		
		List<Integer> commonElements = list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println("Common elements: " + commonElements);
	}
}

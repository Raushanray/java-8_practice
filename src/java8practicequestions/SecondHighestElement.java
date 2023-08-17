package java8practicequestions;

/*
 * Find the second highest element in an array of integers.
 */
import java.util.Arrays;

public class SecondHighestElement {
	public static void main(String[] args) {
		int[] numbers = {12, 34, 45, 23, 56, 10, 7, 89, 59};
		
		//using java -8
		
//		Integer secondMax = Arrays.stream(numbers)
//				                  .distinct() // Remove duplicates if any
//				                  .boxed()   // Convert int to Integer for stream operations
//				                  .sorted((num1, num2) -> Integer.compare(num2, num1)) // Sort in descending order
//				                  .skip(1)  // Skip the first element (which is the maximum)
//				                  .findFirst() // Get the first element, which is the second maximum
//				                  .orElse(-1); // If no second maximum found, provide a default value (e.g., -1)
//		
//		if (secondMax == -1) {
//			System.out.println("No second highest Element is found : ");
//		}else {
//			System.out.println("Second highest element : " + secondMax);
//		}
		
		//without java-8
		
		int firstMax= Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for (int num : numbers) {
			if (num > firstMax) {
				secondMax = firstMax;
				firstMax = num;
			}
			else if (num > secondMax && num != firstMax) {
				secondMax = num;
			}
		}
		
		if (secondMax == Integer.MIN_VALUE) {
			System.out.println("No Second highest element found :");
		}
		else {
			System.out.println("Second Highedt Element : " + secondMax);
		}
	}

}

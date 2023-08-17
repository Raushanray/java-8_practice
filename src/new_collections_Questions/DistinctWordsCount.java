package new_collections_Questions;

import java.util.Arrays;
import java.util.List;

/*
 * Question: Given a list of strings, how would you find the count of distinct words using Java 8 streams and lambda expressions?
 */

public class DistinctWordsCount {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana","apple", "banana", "kiwi", "orange");
		
		long distinctCount = words.stream().distinct().count();
		
		System.out.println("Count of distinct words:  " + distinctCount);
	}

}

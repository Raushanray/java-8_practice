package spring_interview_problem;

//How to get distinct characters and their count in a String?

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DistinctCharsCount {
	public static void main(String[] args) {

		printDistinctCharsWithCount("abc");
		printDistinctCharsWithCount("abcab3");
		printDistinctCharsWithCount("hi there, i am Raushan");
	}

	private static void printDistinctCharsWithCount(String input) {

		Map<Character, Integer> charsWithCountMap = new HashMap<>();
		
		//using map merge method from java -8
		for (char c  : input.toCharArray()) 
			charsWithCountMap.merge(c, 1, Integer::sum);
		System.out.println(charsWithCountMap);
		
		//another way using latest java enhancement and no for loop, a bit complex though
		List<Character> list = input.chars().mapToObj(c -> (char)c).collect(Collectors.toList());
		list.stream().forEach(c -> charsWithCountMap.merge(c, 1, Integer::sum));
		System.out.println(charsWithCountMap);
	}
}

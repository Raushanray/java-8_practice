package java8practicequestions;

import java.util.Map;
import java.util.stream.Collectors;

/*
 * Character Frequency: Given a string, write a Java 8 program to find the frequency of each character in
 *  the string and return the result as a map.
 */


public class CharacterFrequency {
	public static void main(String[] args) {
		String inputString = "HelloRaushanRanjanHowAreYou";
		
		inputString = inputString.toLowerCase();
		Map<Character, Integer> charFrequencyMap = inputString.chars().mapToObj(c -> (char) c)
				.collect(Collectors.toMap(Character -> Character,Character -> 1, Integer::sum));
		
		System.out.println("Frequency of each Character :");
		charFrequencyMap.forEach((character, frequency)->{
			System.out.println(character + " : " + frequency);
		});
	
	}

}

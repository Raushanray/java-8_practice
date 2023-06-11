package spring_interview_problem;

/*
 * Write a program to check if two String are created with same characters?
 * 
 * First of all we will have to create a set of characters from the input Strings. then use equals(),
 * method to check if they contains the same characters or not, hare is a simple program to check 
 * if two Strings are created with same characters.
 */

import java.util.Set;
import java.util.stream.Collectors;

public class CheckSameCharsInString {
	
	public static void main(String[] args) {
		sameCharsString("abc", "cba");
		sameCharsString("aabbcc", "abc");
		sameCharsString("abcd", "abc");
		sameCharsString("11", "1122");
		sameCharsString("1122", "1");
	}

	private static void sameCharsString(String string, String string2) {
		

		Set<Character> set1 = string.chars().mapToObj(c -> (char)c).collect(Collectors.toSet());
		Set<Character> set2 = string2.chars().mapToObj(c -> (char)c).collect(Collectors.toSet());
		System.out.println(set1.equals(set2));
	}

}

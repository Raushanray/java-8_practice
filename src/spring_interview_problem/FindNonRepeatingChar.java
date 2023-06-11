package spring_interview_problem;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a program to find out first non repeated character from input String?
 * 
 */

public class FindNonRepeatingChar {
	public static void main(String[] args) {

		System.out.println(printFindNonRepeatingChar("abcaabcdedxy"));
		System.out.println(printFindNonRepeatingChar("abca"));
		System.out.println(printFindNonRepeatingChar("aaa"));
	}

	private static Character printFindNonRepeatingChar(String string) {
		char[] chars = string.toCharArray();
		List<Character> discardedChars = new ArrayList<>();
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if (discardedChars.contains(c)) 
				continue;
			for (int j = i; j < chars.length; j++) {
				if (c == chars[j]) { //match found
					discardedChars.add(c);
				}else if (j == chars.length -1) { //no match found till end
					return c;
				}
				
			}
			
		}
		return null;
	}
}

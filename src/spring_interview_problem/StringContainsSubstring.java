package spring_interview_problem;

/*
 * Read two String user input and check  if first contains seconds?
 * 
 * This is a simple program and we can String contains() method to check if specified string is part of this
 * string. However we will have to use "Scanner class" to read user inputs.
 *  
 */

import java.util.Scanner;

public class StringContainsSubstring {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String s1 = scanner.nextLine();

		System.out.println("Second First String: ");
		String s2 = scanner.nextLine();
		scanner.close();

		boolean result = stringContainsSubstring(s1, s2);
		System.out.println(s1 + " contains " + s2 + " = " + result);
	}

	private static boolean stringContainsSubstring(String string, String substring) {
		boolean result = false;
		result = string.contains(substring);
		return result;
	}

}

/*
 * Output :-
 * here is a simple output of above program.
 * 
 * Enter First String:
 * Raushan
 * Second First String: 
 * au
 * Raushan contains au = true
 */ 
 

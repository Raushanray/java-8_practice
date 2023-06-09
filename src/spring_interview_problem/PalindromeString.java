package spring_interview_problem;

/*
 *How to check if a String is Palindrome?
 * A Palindrome String is one whose reverse is also same String. so we can reverse the input string and check if both strings are equals for
 * this . or we can be smart and use the String charAt(int index) method to check for Palindrome String...
 */

public class PalindromeString {
	public static void main(String[] args) {
		
		checkPalindromeString("abc");
		checkPalindromeString("abcab3");
		checkPalindromeString("@#&^");
		checkPalindromeString("121");
		
	}

	private static void checkPalindromeString(String input) {
		
		boolean result = true;
		int  length = input.length();
		for (int i = 0; i < length/2; i++) {
			if (input.charAt(i) != input.charAt(length -i-1)) {
				result = false;
				break;
			}
		}
		System.out.println(input + " is palindrome = " + result);
	}

}

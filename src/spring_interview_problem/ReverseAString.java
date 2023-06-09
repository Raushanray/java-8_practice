package spring_interview_problem;

/*
 * Write a java program to reverse a String?
 * 
 * StringBuilder/StringBuffer reverse() method
 * Using Char/byte array and traverse in reverse direction and populate the result String.
 * However if you are not sure of input String content, always use StringBuilder built-in reverse()
 * Method. Because using char and byte array may produce unwanted results. i have provided a complete explanation for in Reverse a String in java.
 * 
 */


public class ReverseAString {
	public static void main(String[] args) {
		reverseInputString("abc");
		reverseInputString("@#&^"); //special chars
	}

	private static void reverseInputString(String input) {

		StringBuilder sb = new StringBuilder(input);
		String result = sb.reverse().toString();
		System.out.println(result);
	}

}

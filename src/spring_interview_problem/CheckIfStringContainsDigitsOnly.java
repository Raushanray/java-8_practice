package spring_interview_problem;

/*
 * Provide two ways to check if a  String contains only digits?
 * We can use regural expression to check if a String is numeric or not.
 *  Another way is to parse it to Long and if it's a non numeric String
 *  then it will throw NumberFormatException.
 */

public class CheckIfStringContainsDigitsOnly {
	public static void main(String[] args) {
		digitsOnlyString("111");
		digitsOnlyString("111a 1");
		digitsOnlyString("111 222");
		digitsOnlyString("111L");
	}

	private static void digitsOnlyString(String string) {
		if (string.matches("\\d+")) 
			System.out.println("Digit Only String: " + string);
		
		try {
			long l = Long.parseLong(string);
			System.out.println("Digit Only String: " + string);
			
		} catch (Exception e) {
			System.out.println("Non Digit Only String: " + string);
		}
	}

}

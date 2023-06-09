package spring_interview_problem;

/*
 * How to remove all occurrences of a given character from input String?
 * There is no remove function in the String class, but we can use replaceAll() in this case. Here is the 
 * simple program showing how to do it.
 */

public class RemoveCharFromString {

	public static void main(String[] args) {
		removeCharFromString("abcbcdjfkd" , 'c');
		removeCharFromString("Raushan", 'R');
		removeCharFromString("@$&@",'@');
		
	}

	private static void removeCharFromString(String input, char c) {

		String result = input.replaceAll(String.valueOf(c), "");
		System.out.println(result);
	}
}

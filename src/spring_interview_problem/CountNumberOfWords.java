package spring_interview_problem;

/*
 * Write a program to count number of words in a String?.
 * The simple solution to this program seems to be input.split("").length but this won't work if your String 
 * is not properly formatted and it contains leading and trailing space, duplicate multiple space and tabs.
 * 
 * Luckily String split() function takes regular expression as argument and we can use it to count the number of words in a String.
 */

public class CountNumberOfWords {
	
	public static void main(String[] args) {
		
		CountNumberOfWords("My name is Raushan");
		CountNumberOfWords("I love java programming");
		CountNumberOfWords("This is not properly formatted line");
	}

	private static void CountNumberOfWords(String line) {

//		System.out.println(line.split("").length); //won't work with tabs and multiple space
		
		String trimmedLine = line.trim();
		int count = trimmedLine.isEmpty() ? 0 : trimmedLine.split("\\s").length;
		System.out.println(count);
	}

}

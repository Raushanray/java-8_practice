package spring_interview_problem;

import java.util.Scanner;


/*
 * How to swap to string without using a thirf variable?
 * 
 * we can do it using String substring() method. here is an simple code snippet to showcase this:
 * 
 * String s1 = "abc";
 * String s2 = "def";
 * 
 * s1 = s1.concat(s2);
 * s2 = s1.substring(0,s1.length()-s2.length());
 * s1 =s1.substring(s2.length());
 * 
 * What if we have to write a function to do this? since String is immutable,
 *  the change in values of the String references in the method will be gone as soon 
 *  as the method ends. also we can't return multiple objects from a method in java. 
 *  so we will have to create a Container to hold the input strings and then perform the above
 *  logic in the method. Below code shows how this can be done,  although it 
 *  might look complex but the logic is same as above..	
 */
public class SwapTwoStrings {

	public static void main(String[] args) {

		Container container = new Container();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String: ");
		container.setFirstString(scanner.nextLine());
		
		System.out.println("Enter Second  String:");
		container.setSecondString(scanner.nextLine());
		scanner.close();
		
		System.out.println(container);
		container = swapString(container);
		System.out.println(container);

	}

	private static Container swapString(Container container) {
		container.setFirstString(container.getFirstString().concat(container.getSecondString())); //s1= s1+s2
		container.setSecondString(container.getFirstString()
				.substring(0, container.getFirstString().length()-container.getSecondString().length()));//s2=s1
		
		container.setFirstString(container.getFirstString().substring(container.getSecondString().length()));
		
		return container;
	}
}

 class Container {
	 private String firstString;
	 private String secondString;
	 
	public String getFirstString() {
		return firstString;
	}
	public String getSecondString() {
		return secondString;
	}
	public void setFirstString(String firstString) {
		this.firstString = firstString;
	}
	public void setSecondString(String secondString) {
		this.secondString = secondString;
	}
	@Override
	public String toString() {
		return "Container [firstString = " + firstString + ", secondString = " + secondString + "]";
	}
	 
	 

 }
 
/*
 * sample output:
 * 
 * Enter First String: java Enter Second String: python Container [firstString =
 * java, secondString = python] Container [firstString = python, secondString =
 * java]
 * 
 */
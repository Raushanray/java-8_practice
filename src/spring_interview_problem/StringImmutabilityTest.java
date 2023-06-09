package spring_interview_problem;

/*
 * How to prove String is immutable programatically?
 * We know that String is immutable in java, however new developers still get confused with this
 * let's try to understand the reason for this confusion.
 * 
 * String s1 = "java";
 * s1 ="Python";
 * 
 * in above code snippet, we can say that s1 value got changed and it's a String object. so how can we 
 * say that String is immutable?
 * 
 * The most important point to understand is how String get created in java. when we create a String using String
 * literal, it doesn't change the value of original String. it creates a new String in the String pool and 
 * change the reference of the variable. so original String value is never changed and that's
 * why String are immutable.
 * Below program proofs our Statement, read out the comments for proper understanding the concept.
 */

public class StringImmutabilityTest {
	public static void main(String[] args) {
		String s1 = "java"; //"java" String created in pool and reference assigned to 1
		String s2 = s1; //s2 is also having the same reference to "java" in the pool
		
		//proof that s1 and s2 have same reference 
		System.out.println(s1 == s2); //true
		
		s1 ="Python";
		//s1 value got chanhed above, so how String is immutable?
		
		// well, in above case a new String "Python" got created in the pool
		// s1 is now referring to the new String in the pool
		//BUT, the original String "java" is still unchanged and remains in the pool
		//s2 is still referring to the origin String "java" in the pool
		
		//proof that s1 and s2 have different reference 
		System.out.println(s1 == s2);//false
		
		System.out.println(s2);
		//print "java" supporting the fact that original String value is unchanged, hence String is immutable
	}

}

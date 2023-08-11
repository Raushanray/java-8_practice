package wrapper_class_pratice;

public class WrapperClassTest {
	public static void main(String[] args) {
		
		Boolean b = new Boolean("true"); //true  //Boolean(String s)-> accept a string as its argument 
		Boolean b1 = new Boolean("true");
		System.out.println(b.equals(b1));  //gress it is true of false --> it return true..
		//boolean equals (Object o); -> check either both tha value are true or false and return - true.
		
		Boolean b2 = new Boolean("True"); //true
		//Boolean(String value) -> this is not case sansitive (As log as you pass the value "true" that's works!!)
		
		Boolean b3 = new Boolean("tRue"); //true
		
		System.out.println(b2.equals(b3)); //guess it is true or false -> true
		
		Boolean b4 = new Boolean("hey"); //false
		//(if the string is not true it's treated as false)..
		
		Boolean b5 = new Boolean("bye"); //false
		
		System.out.println(b4.equals(b5)); //guess it is true or false -> true
		
		Boolean b6 = new Boolean("hello");
		
		Boolean b7 = new Boolean(false);
		
		System.out.println(b6.equals(b7)); //guess it is ture or false  -> true
		
	}

}

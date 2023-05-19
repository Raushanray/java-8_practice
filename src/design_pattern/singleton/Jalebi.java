package design_pattern.singleton;

public class Jalebi {
	//Eager way of creating singleton object
	private static Jalebi jalebi = new Jalebi();

	public static Jalebi getJalebi() {
		return jalebi ;
	}

}
 /*
  * this is not a good for creating singleton object.
  * because object are cteated autometically when the project run.. 
  * this memory westing and time taking..
  * 
  */

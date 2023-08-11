package var_args_practice;
/*
 * arargs methods will always get the last priority by the JVM when there are overloaded methods.
 *  Promotion of a byte to an int (widening-conversion ) will be preferred over a var-args type method.

The reason behind this is that the language needs to be backward compatible.The older feature takes priority
 over the newer features. We all know varargs concept came java 1.5 version ( JDK 5).
 */
public class VarCase {
	void m1(int a, int b, int c) {
		System.out.println("In int param of m1 method");
	}
	void m1(byte... b) {
		System.out.println("In byte var-args param of m1 method");
	}
	
	public static void main(String[] args) {
		VarCase c = new VarCase();
		byte b =10;
		c.m1(b,b,b); // Q>the Question over here which particular method will execute..
		//Ans -> it will run with m1(int a, int b, int c) , because the jvm will find the same type of data is not found
		//then the jvm will any one method over here which can store over here, and here we have a m1(int a, int b, int c) 
		//this is int type .. widder of byte..
	}

}

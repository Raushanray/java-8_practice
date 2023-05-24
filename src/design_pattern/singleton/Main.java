package design_pattern.singleton;

import java.lang.reflect.Constructor;

public class Main {
	public static void main(String[] args) throws Exception{
//		// Lazy way of creating singleton object
//		Samosa samosa1 = Samosa.getSamosa();
//		System.out.println(samosa1.hashCode());
//
//		Samosa samosa2 = Samosa.getSamosa();
//		System.out.println(samosa2.hashCode());
//
//		// Eager way of creating singleton object
//		System.out.println(Jalebi.getJalebi().hashCode());
//		System.out.println(Jalebi.getJalebi().hashCode());
		
		
		/*
		 * Way for  break the singleton pattern
		 * 1. Reflection API to break the singleton pattern.
		 * solution:- a)- if object is there == throws the exception from inside the constructor
		 * b) - use enum 
		 * 
		 */
		
		Samosa s1 = Samosa.INSTANCE;
		System.out.println(s1.hashCode());
		
		Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Samosa s2 = constructor.newInstance();
		System.out.println(s2.hashCode());
		
	}

}

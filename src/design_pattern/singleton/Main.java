package design_pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
		 * 2. Deserialiazation :-
		 * 
		 */
		
//		Samosa s1 = Samosa.INSTANCE;
//		System.out.println(s1.hashCode());
//		s1.test();
//		
//		Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		Samosa s2 = constructor.newInstance();
//		System.out.println(s2.hashCode());
		
		Samosa samosa = Samosa.getSamosa();
		System.out.println(samosa.hashCode());
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("xyz.ob"));
		oos.writeObject(samosa);
		
		System.out.println("serialiazation is done..");
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("xyz.ob"));
		Samosa s2 =(Samosa) ois.readObject();
		System.out.println(s2.hashCode());
		
	}

}

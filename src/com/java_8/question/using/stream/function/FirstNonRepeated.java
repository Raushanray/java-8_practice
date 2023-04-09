package com.java_8.question.using.stream.function;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

// Given a String, find the first non-repeated character in it using Stream functions?
public class FirstNonRepeated {
	public static void main(String[] args) {
		String input = "Java is  very secure Language";
		Character result = input.chars()// stream of string
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase
																					
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Store the chars in map with count
																												
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.get();
		System.out.println(result);
	}
}

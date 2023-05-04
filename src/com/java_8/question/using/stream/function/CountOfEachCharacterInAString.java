package com.java_8.question.using.stream.function;

//Write a program to print the count of each character in a String?

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfEachCharacterInAString {
	public static void main(String[] args) {
		String s = "string data to count each character";
		Map<String, Long> map = Arrays.stream(s.split(""))
                .map(String::toLowerCase)
                .collect(Collectors
                .groupingBy(str -> str, 
                  LinkedHashMap::new, Collectors.counting()));
		System.out.println(map);
		
	}
	
		
		

}

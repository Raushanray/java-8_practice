package com.java_8.question.using.stream.function;

// How to use map to convert object into Uppercase in Java 8?
import java.util.Arrays;
import java.util.Collection;

//How to use map to convert object into Uppercase in Java 8?

import java.util.List;
import java.util.stream.Collectors;

public class Covert_Obj_Into_Ucase_Using_Map {
	public static void main(String[] args) {
		 List<String> names = Arrays.asList("aa", "bb", "cc");
		List<String> nameLst = names.stream()
                 .map(String::toUpperCase)
                 .collect(Collectors.toList());
System.out.println(nameLst);
		
		
	}

}

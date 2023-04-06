package com.java_8.question.using.stream.function;

import java.util.Arrays;
import java.util.List;

// Given a list of integers, find out all the numbers starting with 1 using Stream functions?
public class NumberStartingWithOne {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		list.stream().map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);
	}
}

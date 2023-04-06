package com.java_8.question.using.stream.function;

import java.util.Arrays;
import java.util.List;

// Given a list of integers, find the maximum value element present in it using Stream functions?
public class FindMaxElement {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		int max = myList.stream().max(Integer::compare).get();
		System.out.println(max);
	}
}

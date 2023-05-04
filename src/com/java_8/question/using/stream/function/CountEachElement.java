package com.java_8.question.using.stream.function;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachElement {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("AA", "BB", "CC", "AA");
		Map<String, Long> namesCount  = names.stream()
		     .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(namesCount);
	}

}

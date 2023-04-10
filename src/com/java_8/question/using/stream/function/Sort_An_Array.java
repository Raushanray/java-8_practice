package com.java_8.question.using.stream.function;
//  Write a Java 8 program to sort an array and then convert the sorted array into Stream?
import java.util.Arrays;

public class Sort_An_Array {

public static void main(String[] args) {
	int arr[] = {99, 55, 203, 99, 4, 91 };
	Arrays.parallelSort(arr);
	// Sorted the Array using parallelSort()
	Arrays.stream(arr).forEach(n -> System.out.print(n +" "));
	/* Converted it into Stream and then
    printed using forEach */
	
}
}

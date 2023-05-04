package com.java_8.question.using.stream.function;

import java.util.Arrays;

// Write a Program to find the Maximum element in an array?

public class MaximumElement {
	public static void main(String[] args) {
		
		 int[] arr = {10, 20, 30, 5, 15,80};
		 System.out.println("Maximum element in the array is : " + findMaxElement(arr));
	}
	public static int findMaxElement(int[] arr) {
		  return Arrays.stream(arr).max().getAsInt();
		}

	
}

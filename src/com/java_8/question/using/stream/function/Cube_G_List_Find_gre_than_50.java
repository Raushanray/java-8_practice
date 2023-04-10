package com.java_8.question.using.stream.function;
//  Java 8 program to perform cube on list elements and filter numbers greater than 50.
import java.util.Arrays;
import java.util.List;

public class Cube_G_List_Find_gre_than_50 {
	public static void main(String[] args) {
		List<Integer> integetList = Arrays.asList(4, 5, 6, 7, 1, 2, 3);
		integetList.stream().map(i -> i * i * i).filter(i -> i > 50).forEach(System.out::println);
	}
}

package com.java_8.question.using.stream.function;

// How will you get the current date and time using Java 8 Date and Time API?
public class Current_Date_Time {
	public static void main(String[] args) {
		System.out.println("current local Date :" + java.time.LocalDate.now());// Used LocalDate API to get the date
		System.out.println("current local Time :" + java.time.LocalTime.now());// Used LocalTime API to get the time
		System.out.println("current Local Date and Time :" + java.time.LocalDateTime.now());// Used LocalDateTime API to get both date and time
	}
}

package java8practicequestions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Prime Numbers: Write a Java 8 program to generate the first 'n' prime numbers and return them as a list.
 */
public class PrimeNumbersUsingStreams {
	public static void main(String[] args) {

		int n=10;
		List<Integer> primeNumbers = Stream.iterate(2, num -> num +1)
		.filter(PrimeNumbersUsingStreams::isPrime)
		.limit(n).collect(Collectors.toList());
		System.out.println("First " + n + "primeNumbers: " + primeNumbers);
		
		
	}
	private static boolean isPrime(int num) {
		if (num <= 1){ 
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i ==0) {
				return false;
			}
		}
		return true;
		
	}

}

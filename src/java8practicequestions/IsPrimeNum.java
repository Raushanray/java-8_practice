package java8practicequestions;

import java.util.stream.IntStream;

//without user input
public class IsPrimeNum {
	public static void main(String[] args) {
		int number = 17;
		
		 boolean isPrime = IntStream.rangeClosed(2, (int) Math.sqrt(number)).noneMatch(i -> number % i ==0);
		 if (isPrime) {
		System.out.println(number + " is a prime number.");	
		}
		 else {
			System.out.println(number + " is  not a prime number.");
		}
	}

}

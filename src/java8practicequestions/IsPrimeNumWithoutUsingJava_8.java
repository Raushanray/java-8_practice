package java8practicequestions;

import java.util.Scanner;

public class IsPrimeNumWithoutUsingJava_8 {

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i ==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		if (isPrime(num)) {
			System.out.println(num + ":  Number is prime.");
		}else {
			System.out.println(num + ":  Number is not a prime.");
		}
		scanner.close();
	}
}

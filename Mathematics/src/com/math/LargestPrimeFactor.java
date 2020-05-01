package com.math;

import java.util.Scanner;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testcases = scanner.nextInt();
			while (testcases-- > 0) {
				long number = scanner.nextLong();
				long result = compute(number);
				System.out.println(result);
			}
		}
	}

	private static long compute(long number) {
		long maxPrime = -1;
		while (number % 2 == 0)
			number /= 2;
		for (int i = 3; i <= Math.sqrt(number); i++) {
			while (number % i == 0) {
				number /= i;
				maxPrime = i;
			}
		}
		return number > 2 ? number : maxPrime;
	}
}

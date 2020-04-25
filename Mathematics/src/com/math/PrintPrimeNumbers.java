package com.math;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				int number = scanner.nextInt();
				boolean[] primeArray = getPrimeArray(number);
				for (int i = 2; i <= number; i++) {
					if (primeArray[i]) {
						System.out.print(i + " ");
					}
				}
				System.out.println();
			}
		}
	}

	private static boolean[] getPrimeArray(int number) {
		boolean[] prime = new boolean[number + 1];
		for (int i = 2; i <= number; i++) {
			prime[i] = true;
		}
		for (int p = 2; p * p <= number; p++) {
			if (prime[p]) {
				for (int j = p * 2; j <= number; j += p) {
					prime[j] = false;
				}
			}
		}
		return prime;
	}

}

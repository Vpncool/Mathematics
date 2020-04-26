package com.math;

import java.util.Scanner;

public class PrintPrimeNumberPairs {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				int number = scanner.nextInt();
				boolean[] prime = primeArray(number);
				printPairs(prime, number);
			}
		}
	}

	private static void printPairs(boolean[] array, int number) {
		for (int i = 2; i <= number; i++) {
			if (array[i]) {
				for (int j = 2; j <= number; j++) {
					if (array[j] && i * j <= number) {
						System.out.print(i + " " + j + " ");
					}
				}
			}
		}
		System.out.println();
	}

	private static boolean[] primeArray(int number) {
		boolean[] array = new boolean[number + 1];
		for (int i = 0; i <= number; i++) {
			array[i] = true;
		}

		for (int p = 2; p * p <= number; p++) {
			if (array[p]) {
				for (int j = p * 2; j <= number; j += p) {
					array[j] = false;
				}
			}
		}
		return array;
	}
}

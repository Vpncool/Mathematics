package com.math;

import java.util.Scanner;

public class SumOfPrimeNumber {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				int number = scanner.nextInt();
				long sum = compute(number);
				System.out.println(sum);
			}
		}
	}

	private static long compute(int number) {
		boolean[] array = new boolean[number + 1];
		for (int i = 2; i <= number; i++) {
			array[i] = true;
		}

		for (int p = 2; p * p <= number; p++) {
			if (array[p]) {
				for (int j = p * 2; j <= number; j += p) {
					array[j] = false;
				}
			}
		}

		long sum = 0;
		for (int i = 2; i <= number; i++) {
			if (array[i]) {
				sum += i;
			}
		}
		return sum;
	}
}
package com.math;

import java.util.Scanner;

public class KthDigitFromRight {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				int k = scanner.nextInt();
				long result = getKthDigit(a, b, k);
				System.out.println(result);
			}
		}
	}

	private static long getKthDigit(int a, int b, int k) {
		long result = a;
		while (b-- > 1) {
			result *= a;
		}
		while (k-- > 1) {
			result /= 10;
		}
		return result % 10;
	}
}

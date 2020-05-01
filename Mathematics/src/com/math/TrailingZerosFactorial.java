package com.math;

import java.util.Scanner;

public class TrailingZerosFactorial {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				int number = scanner.nextInt();
				int result = compute(number);
				System.out.println(result);
			}
		}
	}

	private static int compute(int number) {
		int trailingZeros = 0;
		while (number != 0) {
			trailingZeros += number /= 5;
		}
		return trailingZeros;
	}
}

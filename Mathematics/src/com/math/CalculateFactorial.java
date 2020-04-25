package com.math;

import java.util.Scanner;

public class CalculateFactorial {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				long number = scanner.nextLong();
				System.out.println(factorial(number));
			}

		}
	}

	private static long factorial(long number) {
		long fact = 1;
		while (number > 1) {
			fact *= number--;
		}
		return fact;
	}
}

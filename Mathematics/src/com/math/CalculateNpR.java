package com.math;

import java.util.Scanner;

public class CalculateNpR {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				int n = scanner.nextInt();
				int r = scanner.nextInt();
				long result = getNpR(n, r);
				System.out.println(result);
			}
		}
	}

	private static long getNpR(int n, int r) {
		return factorial(n) / factorial(n - r);
	}

	private static long factorial(int number) {
		long fact = 1;
		while (number > 1) {
			fact *= number--;
		}
		return fact;
	}
}

package com.math;

import java.util.Scanner;

public class CalculateGCD {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
				int gcd = calculateGCD(num1, num2);
				System.out.println(gcd);
			}
		}
	}

	private static int calculateGCD(int num1, int num2) {
		num1 = num1 > 0 ? num1 : -num1;
		num2 = num2 > 0 ? num2 : -num2;
		while (num1 != num2) {
			if (num1 > num2) {
				num1 -= num2;
			} else {
				num2 -= num1;
			}
		}
		return num1;
	}
}

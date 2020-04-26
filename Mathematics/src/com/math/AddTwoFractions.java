package com.math;

import java.util.Scanner;

public class AddTwoFractions {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				int num1 = scanner.nextInt();
				int den1 = scanner.nextInt();
				int num2 = scanner.nextInt();
				int den2 = scanner.nextInt();
				addFraction(num1, den1, num2, den2);
			}
		}
	}

	private static void addFraction(int num1, int den1, int num2, int den2) {
		int num = num1 * den2 + num2 * den1;
		int den = den1 * den2;
		int divisior = gcd(num, den);
		System.out.println(num / divisior + "/" + den / divisior);
	}

	private static int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}

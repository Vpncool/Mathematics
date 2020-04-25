package com.math;

import java.util.Scanner;

public class CalculateLCM {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			long testCase = scanner.nextLong();
			while (testCase-- > 0) {
				long num1 = scanner.nextLong();
				long num2 = scanner.nextLong();
				long gcd = getGCD(num1, num2);
				long lcm = getLCM(num1, num2, gcd);
				System.out.println(lcm + " " + gcd);
			}
		}
	}

	private static long getGCD(long num1, long num2) {
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

	private static long getLCM(long num1, long num2, long gcd) {
		return (num1 * num2) / gcd;
	}
}

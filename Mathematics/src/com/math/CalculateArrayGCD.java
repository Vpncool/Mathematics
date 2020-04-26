package com.math;

import java.util.Scanner;

public class CalculateArrayGCD {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				int size = scanner.nextInt();
				int[] array = new int[size];
				for (int i = 0; i < size; i++) {
					array[i] = scanner.nextInt();
				}
				int result = calculateGCD(array);
				System.out.println(result);
			}
		}
	}

	private static int calculateGCD(int[] array) {
		int temp = array[0];
		if (array.length == 1) {
			return temp;
		}
		for (int i = 1; i < array.length; i++) {
			temp = gcd(temp, array[i]);
		}
		return temp;
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

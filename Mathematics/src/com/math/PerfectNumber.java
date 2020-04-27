package com.math;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/sum-of-all-prime-numbers-between-1-and-n/0
public class PerfectNumber {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				long number = scanner.nextLong();
				int result = isPerfectNumber(number);
				System.out.println(result);
			}
		}
	}

	private static int isPerfectNumber(long number) {
		long factor = 2;
		long sum = 1;
		while (factor * factor < number) {
			if (number % factor == 0) {
				sum += factor + number / factor;
			}
			factor++;
		}
		return sum == number ? 1 : 0;
	}
}

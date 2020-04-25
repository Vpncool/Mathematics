package com.math;

import java.util.Scanner;

public class ValidatePrimeNumber {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				int number = scanner.nextInt();
				if (number == 1) {
					System.out.println("No");
					continue;
				}
				int sqrt = sqrt(number);
				System.out.println(isPrimeNumber(number, sqrt) ? "Yes" : "No");
			}
		}
	}

	private static boolean isPrimeNumber(int number, int sqrt) {
		for (int i = 2; i <= (Math.sqrt(number) + 1); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	private static int sqrt(int number) {
		float n1 = number / 2;
		float n2;
		while (true) {
			n2 = number / n1;
			n1 = (n1 + n2) / 2;
			if (n1 - n2 > 0.001 && n2 - n1 < 0.001) {
				break;
			}
		}
		return (int) n1;
	}

}

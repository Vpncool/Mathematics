package com.math;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			scanner.nextLine();
			while (testCase-- > 0) {
				long number = Long.parseLong(scanner.nextLine());
				long result = reverse(number);
				System.out.println(result);
			}
		}
	}

	private static long reverse(long number) {
		long result = 0;
		while (number > 0) {
			result = (result * 10 + number % 10);
			number /= 10;
		}
		return result;
	}
}

package com.math;

import java.util.Scanner;

public class CalculateSeriesGP {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				float num1 = scanner.nextFloat();
				float num2 = scanner.nextFloat();
				int term = scanner.nextInt();
				int result = calculateNthTerm(num1, num2, term);
				System.out.println(result);
			}
		}
	}

	private static int calculateNthTerm(float num1, float num2, int term) {
		float gp = num2 / num1;
		float result = num1;
		while (term --> 1) {
			result *= gp;
		}
		return (int) Math.floor(result);
	}
}

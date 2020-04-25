package com.math;

import java.util.Scanner;

public class CalculateSqrt {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				int number = scanner.nextInt();
				float sqrt = calculateSqrt(number);
				System.out.println(sqrt);
			}
		}
	}

	private static float calculateSqrt(int number) {
		float n1 = number/2;
		float n2;
		while(true) {
			n2 = number/n1;
			n1 = (n1+n2)/2;
			if(n1 - n2 < 0.001 && n2 - n1 > -0.001) {
				break;
			}
		}
		return n1;
	}
}

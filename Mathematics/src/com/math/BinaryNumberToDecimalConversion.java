package com.math;

import java.util.Scanner;

public class BinaryNumberToDecimalConversion {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			scanner.nextLine();
			while (testCase-- > 0) {
				String binaryNumber = scanner.nextLine();
				long decimal = binaryToDecimalConversion(Long.parseLong(binaryNumber));
				System.out.println(decimal);
			}
		}
	}

	private static long binaryToDecimalConversion(long binaryNumber) {
		long decimal = 0;
		long multiplier = 2;
		decimal = (binaryNumber % 10) * 1;
		binaryNumber /= 10;
		while (binaryNumber > 0) {
			decimal += (binaryNumber % 10) * multiplier;
			multiplier *= 2;
			binaryNumber /= 10;
		}
		return decimal;
	}
}

package com.math;

import java.util.Scanner;

public class CountSquares {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				long number = scanner.nextLong();
				long squareCount = (long) Math.sqrt(number);
				if (squareCount * squareCount < number)
					System.out.println(squareCount);
				else {
					System.out.println(squareCount - 1);
				}
			}
		}
	}
}

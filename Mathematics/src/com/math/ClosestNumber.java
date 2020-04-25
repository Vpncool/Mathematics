package com.math;

import java.util.Scanner;

// https://practice.geeksforgeeks.org/problems/closest-number/0/?track=interview-mathematical&batchId=117

public class ClosestNumber {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
				int result = getClosestNumber(num1, num2);
				System.out.println(result); 
			}
		}
	}

	private static int getClosestNumber(int num1, int num2) {
		int q = num1 / num2;
		int result1 = num2*q;
		int result2 = (num1*num2) > 0 ? (num2 *(q+1)) : (num2*(q-1));
		return Math.abs(num1 - result1) < Math.abs(num1 - result2) ? result1 : result2;
	}
}

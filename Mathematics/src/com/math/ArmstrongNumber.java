package com.math;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)){
			int testCase = scanner.nextInt();
			while(testCase --> 0) {
				int number = scanner.nextInt();
				System.out.println(isArmstrongNumber(number));
			}
		}
	}

	private static String isArmstrongNumber(int number) {
		int temp = number;
		int sum = 0;
		while(temp > 1) {
			int mod = temp % 10;
			sum += (mod*mod*mod);
			temp /= 10;
		}
		return sum == number ? "Yes" : "No";
	}

}

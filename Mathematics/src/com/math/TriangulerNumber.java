package com.math;

import java.util.Scanner;

public class TriangulerNumber {
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			int testCase = scanner.nextInt();
			while(testCase --> 0) {
				long number = scanner.nextLong();
				int result = isTriangulerNumber(number);
				System.out.println(result);
			}
		}
	}

	private static int isTriangulerNumber(long number) {
		long x = (long)Math.sqrt(2*number);
		if(x*(x+1) == 2*number) {
			return 1;
		}
		return 0;
	}
}

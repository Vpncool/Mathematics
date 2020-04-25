package com.math;

import java.util.Scanner;

public class SeriesAP {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				int num1 = scanner.nextInt();
				int num2 = scanner.nextInt();
				int term = scanner.nextInt();
				System.out.println(getTerm(num1, num2, term));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int getTerm(int num1, int num2, int term) {
		return num1 + (term - 1) * (num2 - num1);
	}

}

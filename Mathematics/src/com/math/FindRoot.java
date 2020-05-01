package com.math;

import java.util.Scanner;

public class FindRoot {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				double number = scanner.nextDouble();
				int root = scanner.nextInt();
				double precision = scanner.nextDouble();
				double result = findRoot(number, root, precision);
				System.out.println(result);
			}
		}
	}

	private static double findRoot(double number, int root, double precision) {
		double start = 0;
		double end = number / 2;
		double mid = end;
		while (true) {
			System.out.println("Diff :: "+diff(number, mid, root));
			if (precision >= diff(number, mid, root)) {
				return mid;
			}
			if (pow(mid, root) > number) {
				end = mid;
			} else {
				start = mid;
			}
			mid = (start + end) / 2;
		}
	}

	private static double diff(double number, double mid, int n) {
		double power = pow(mid, n);
		return number > power ? number - power : power - number;
	}

	private static double pow(double number, int pow) {
		double result = number;
		while (pow-- > 1) {
			result *= number;
		}
		return result;
	}
}

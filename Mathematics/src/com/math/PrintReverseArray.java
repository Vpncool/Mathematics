package com.math;

import java.util.Scanner;

public class PrintReverseArray {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				int size = scanner.nextInt();
				int[] array = new int[size];
				for (int i = 0; i < size; i++) {
					array[i] = scanner.nextInt();
				}
				reverse(array);
				System.out.println();
			}
		}
	}

	private static void reverse(int[] array) {
		int length = array.length;
		for (int i = length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

	private static void reverseTemp(int[] array) {
		int i = 0;
		int j = array.length - 1;
		while (i <= j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
	}
}

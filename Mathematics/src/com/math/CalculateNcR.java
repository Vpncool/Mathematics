package com.math;

import java.util.Scanner;

public class CalculateNcR {

		private static int[][] array;
	
		static {
			array = new int[1001][1001];
			for (int i = 0; i < 1001; i++) {
				for (int j = 0; j <= i; j++) {
					if (j == 0 || j == 1) {
						array[i][j] = 1;
					} else {
						array[i][j] = array[i - 1][j - 1] % 1000000007 + array[i - 1][j] % 1000000007;
					}
				}
			}
		}
	
		public static void main(String[] args) {
			try (Scanner scanner = new Scanner(System.in)) {
				int testCase = scanner.nextInt();
				while (testCase-- > 0) {
					int n = scanner.nextInt();
					int r = scanner.nextInt();
					System.out.println(array[n][r]);
				}
			}
		}

}

package com.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class JumpingNumber {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				int number = scanner.nextInt();
				printJumpingNumber(number);
			}
		}
	}

	private static void printJumpingNumber(int number) {
		LinkedList<Integer> queue = new LinkedList<>();
		ArrayList<Integer> resultList = new ArrayList<>();
		System.out.print("0 ");
		for (int i = 1; i <= 9; i++) {
			queue.add(i);
			while (!queue.isEmpty()) {
				int temp = queue.remove();
				if (temp > number) {
					continue;
				}
				resultList.add(temp);
				int rightMost = temp % 10;
				if (rightMost > 0) {
					queue.add(temp * 10 + (rightMost - 1));
				}
				if (rightMost < 9) {
					queue.add(temp * 10 + (rightMost + 1));
				}
			}
		}
		Collections.sort(resultList);
		for (Integer item : resultList) {
			System.out.print(item+" ");
		}
		System.out.println();
	}
}

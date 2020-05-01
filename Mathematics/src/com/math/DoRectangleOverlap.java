package com.math;

import java.util.Scanner;

public class DoRectangleOverlap {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				int x1 = scanner.nextInt();
				int y1 = scanner.nextInt();
				Point l1 = new Point(x1, y1);
				int x2 = scanner.nextInt();
				int y2 = scanner.nextInt();
				Point r1 = new Point(x2, y2);
				int x3 = scanner.nextInt();
				int y3 = scanner.nextInt();
				Point l2 = new Point(x3, y3);
				int x4 = scanner.nextInt();
				int y4 = scanner.nextInt();
				Point r2 = new Point(x4, y4);
				int result = doOverlap(l1, r1, l2, r2);
				System.out.println(result);
			}
		}
	}

	private static int doOverlap(Point l1, Point r1, Point l2, Point r2) {
		if(r1.x < l2.x || l1.x > r2.x) {
			return 0;
		}
		if(r1.y > l2.y || l1.y < r2.y) {
			return 0;
		}
		return 1;
	}

	static class Point {
		private int x;
		private int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

	}
}

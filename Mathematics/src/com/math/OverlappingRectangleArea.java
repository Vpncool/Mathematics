package com.math;

import java.util.Scanner;

public class OverlappingRectangleArea {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int testCase = scanner.nextInt();
			while (testCase-- > 0) {
				System.out.println("First Rectangle Points 1");
				System.out.println("X axis");
				int x1 = scanner.nextInt();
				System.out.println("Y axis");
				int y1 = scanner.nextInt();
				RectanglePoint l1 = new RectanglePoint(x1, y1);
				System.out.println("First Rectangle Points 2");
				System.out.println("X axis");
				int x2 = scanner.nextInt();
				System.out.println("Y axis");
				int y2 = scanner.nextInt();
				RectanglePoint r1 = new RectanglePoint(x2, y2);
				System.out.println("Second Rectangle Points 1");
				System.out.println("X axis");
				int x3 = scanner.nextInt();
				System.out.println("Y axis");
				int y3 = scanner.nextInt();
				RectanglePoint l2 = new RectanglePoint(x3, y3);
				System.out.println("Second Rectangle Points 2");
				System.out.println("X axis");
				int x4 = scanner.nextInt();
				System.out.println("Y axis");
				int y4 = scanner.nextInt();
				RectanglePoint r2 = new RectanglePoint(x4, y4);
				int area = calculateArea(l1, r1, l2, r2);
				System.out.println(area);
			}
		}
	}

	private static int calculateArea(RectanglePoint l1, RectanglePoint r1, RectanglePoint l2, RectanglePoint r2) {
		int xDist = distance(r1.getX(), r2.getX(),l1.getX(), l2.getX());
		if (xDist <= 0) {
			return -1;
		}
		int yDist = distance(r1.getY(), r2.getY(), l1.getY(), l2.getY());
		if (yDist <= 0) {
			return -1;
		}
		return xDist * yDist;
	}

	private static int distance(int p1, int p2, int p3, int p4) {
		System.out.println(p1 +" "+ p2 +" "+" "+p3+" "+p4);
		return Math.min(p1,p2) - Math.max(p3,p4);
	}

	static class RectanglePoint {

		private int x;
		private int y;

		public RectanglePoint(int x, int y) {
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

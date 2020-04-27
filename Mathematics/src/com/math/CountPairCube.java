package com.math;

import java.util.Scanner;

public class CountPairCube {
	public static void main (String[] args) {
		
	    try(Scanner scanner = new Scanner(System.in)){
	        int testCase = scanner.nextInt();
	        while(testCase --> 0){
	            double number = scanner.nextDouble();
	            int pair = countCubePair(number,3,0.00001);
	            System.out.println(pair);
	        }
	    } 
	}
	
	private static int countCubePair(double number, int root, double precision){
	    int cubicRoot = (int)getRoot(number,3,precision);
	    int count = 0;
	    int a = cubicRoot;
	    int b = 0;
	    while(true){
	        int sum = (int)power(a,3) + (int)power(b,3);
	        if(sum == number){
	            a--;
	            b++;
	            count++;
	        } else if (sum < number){
	            b++;
	        } else {
	            a--;
	        }
	        if(a < 1){
	            return count;
	        }
	    }
	}
	
	private static double getRoot(double number,int root, double precision){
	    double start = 0;
	    double end = number/2;
	    double mid = end;
	    while(true){
	        double diff = difference(number,mid,root);
	        if(diff <= precision){
	            return mid;
	        }
	        if(power(mid,root) > number){
	            end = mid;
	        } else {
	            start = mid;
	        }
	        mid = (start+end)/2;
	    }
	}
	
	private static double difference(double number, double mid, int root){
	    double poweredNumber = power(mid,root);
	    return number > poweredNumber ? number - poweredNumber : poweredNumber - number; 
	}
	
	private static double power(double number, int p){
		double result = number;
	    while(p --> 1){
	        result *= number;
	    }
	    return result;
	}
}

package com.math;

import java.util.Scanner;

public class PalindromNumber {

	public static void main (String[] args) {
		
	    try(Scanner scanner = new Scanner(System.in)){
	        int testCase = scanner.nextInt();
	        while(testCase --> 0){
	            int number = scanner.nextInt();
	            int sumOfDigits = getSumOfDigits(number);
	            String palindromResult = getPalindromResult(sumOfDigits);
	            System.out.println(palindromResult);
	        }
	    } 
	}
	
	private static String getPalindromResult(int number){
	    int temp = number;
	    int sum = 0;
	    while(temp > 0){
	        sum = (sum*10+temp%10);
	        temp /= 10;
	    }
	    return sum == number ? "Yes" : "No";
	}
	
	private static int getSumOfDigits(int number){
	    int sum = 0;
	    while(number > 0){
	        sum += (number%10);
	        number /= 10;
	    }
	    return sum;
	}

}

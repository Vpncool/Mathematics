package com.math;

import java.util.Scanner;

public class SecondLargestNumber {
	public static void main (String[] args) {
		
	    try(Scanner scanner = new Scanner(System.in)){
	        int testCase = scanner.nextInt();
	        while(testCase --> 0){
	            int size = scanner.nextInt();
	            int[] array = new int[size];
	            for(int i = 0; i<size; i++){
	                array[i] = scanner.nextInt();
	            }
	            int result = secondLargest(array);
	            System.out.println(result);
	        }
	    } 
	}
	
	private static int secondLargest(int[] array){
	    int max1 = Integer.MIN_VALUE;
	    int max2 = Integer.MIN_VALUE;
	    for(int item : array) {
	    	if(item > max1) {
	    		max2 = max1;
	    		max1 = item;
	    	}
	    	if(item < max1 && item > max2) {
	    		max2 = item;
	    	}
	    }
	    
	    return max2;
	}
}

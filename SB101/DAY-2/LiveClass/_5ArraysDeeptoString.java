package com.LiveClass;

import java.util.Arrays;

public class _5ArraysDeeptoString {
	 public static void main(String[] args)
	    {
	        // Create a 2D array
	        
	        int[][] arr = new int[2][2];
	        arr[0][0] = 1;
	        arr[0][1] = 2;
	        arr[1][0] = 3;
	        arr[1][1] = 4;
	  
	        // print 2D integer array using toString() method
	        System.out.println("See what happen when we want to print 2D Array By toString() Method");
	        System.out.println(Arrays.toString(arr));
	        System.out.println(Arrays.deepToString(arr));
	    }
}
/*
 * Problem :-
 *            Arrays.toString() method doesn't work on multidimensional 
 *            arrays.Here's why, multidimensional arrays have arrays inside 
 *            of an array so if you try to use the toString() method to print
 *            multidimensional arrays, it will just print the addresses of the 
 *            elements.
 *Solution : Arrays.deepToString() method which is used to print 
 *           multidimensional arrays by converting them to their string 
 *           representation. Unlike Arrays.toString(), if the array contains 
 *           other arrays as elements, the string representation includes their 
 *           contents as well.   
 *           syntax : public static String deepToString(Object[] array)           
 */



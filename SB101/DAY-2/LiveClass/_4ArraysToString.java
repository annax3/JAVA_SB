package com.LiveClass;

import java.util.Arrays;

public class _4ArraysToString {
	public static void main(String[] args)  
	{  
	//declaring and initializing array  
	int array[] = {1, 2, 3, 4, 5};
	    
	//returns string representation of the specified array  
	System.out.println("Printing Array using Arrays.toSting() method");  
	System.out.println(Arrays.toString(array));  
	 } 
//	Time Complexity: O(n) Space Complexity: O(n)
}
/*
NOTE: A static method is a method that belongs to a class rather 
      than an instance of a class. The method is  accessible to
      every instance of a class, but methods defined in an 
      instance are only able to be accessed by that object 
      of a class.

Array.toString() :- It is a Java static method that is part of java.util 
package which contains several methods that can be used to manipulate the 
array. Array.toString() is used to covert the array that is passed to it 
as an argument to its string representation and instead of printing the 
array by looping over each element, we can print this string representation 
instead.
*/
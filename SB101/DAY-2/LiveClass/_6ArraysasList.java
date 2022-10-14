package com.LiveClass;

import java.util.Arrays;

public class _6ArraysasList {
	public static void main(String [] args)  
	{  
	//declaration and initialization of String array  
	String[] Array={"Scaler","Java","Tutorial"};  
	Object stringArray = null;
	System.out.println(Arrays.asList(stringArray));  
	}  
}
/*
If we have an array of non-primitive data types, we can use Arrays.asList() 
method to print the array. Arrays.asList() method returns a fixed-size list 
backed by the specified array and then that ArrayList can be directly printed.
This method doesn't copy the array elements into a new list, rather it just
provides a list view to our array. It acts like a list wrapped around an 
array.
*/

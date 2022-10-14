package com.LiveClass;

public class _3JavaForEach {
	public static void main(String args[])   
	{  
	// declaration and instantiation of an array

	int[] nums = new int[4];  

	//initializing elements  

	nums[0] = 1;  
	nums[1] = 2;  
	nums[2] = 3;  
	nums[3] = 4;  

	//traversing over an array using for-each loop  

	for (int number: nums)   
	{  
	System.out.print(number + " ");  
	}  
	}  
}
/*
Syntax:

for(Type variable : arrayName){
   // do something with variable
}
*/

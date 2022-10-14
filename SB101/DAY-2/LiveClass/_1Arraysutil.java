package com.LiveClass;

import java.util.Arrays;

public class _1Arraysutil {
	public static void main(String[] args) {
		int[] arr = {10,277,301,4,50,6};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int index = Arrays.binarySearch(arr, 27);
		System.out.println(index);
	}
}
 
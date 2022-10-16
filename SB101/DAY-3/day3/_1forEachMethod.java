package com.day3;

import java.util.Arrays;
import java.util.List;

public class _1forEachMethod {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Amit","Ravi","mohit","Anand");
		names.forEach(name -> System.out.println(name.toUpperCase()));
		//sortCut
		names.forEach(System.out::println);
		
	}
}

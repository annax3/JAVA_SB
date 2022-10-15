package com.LiveClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _7collectionFrequency {
	public static void main(String[] args) {
		List<String> colors = Arrays.asList("blue","Green","purple","Green","White","yellow","Green");
		int result =Collections.frequency(colors,"Green");
		System.out.println(result);
		Collections.sort(colors);
		System.out.println(colors);
	}
}

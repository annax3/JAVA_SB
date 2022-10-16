package com.day3;

import java.util.function.Predicate;

public class _1Demo {
	public static void main(String[] args) {
		Predicate<Integer> p1 = new _1MyPredicate();
		System.out.println(p1.test(-10));
		
		Predicate<Integer> p2 = new _1MyPredicate();
		System.out.println(p2.test((-1)));		
	}
}

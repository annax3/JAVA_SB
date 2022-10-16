package com.day3;

import java.util.function.Predicate;

import com.Day3Revision._9StudentBean;

public class _2Demo {
	public static void main(String[] args) {
		Predicate<_9StudentBean> p1 = new _2MyPredicate();
		System.out.println(p1.test(new _9StudentBean(10,"N1",800)));
		
		Predicate<_9StudentBean> p2 = s->s.getMarks()>700;
		System.out.println(p2.test(new _9StudentBean(12,"N2",850)));
	}
}

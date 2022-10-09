package com.SB101;

public class _3Demo {
	public static void main(String[] args) {
		
		_3Student s1 = new _3Student(10,"N1",500);
		_3Student s2 = new _3Student(10,"N1",500);
		
		//System.out.println(s1==s2); o/p : false
		//System.out.println(s1.equals(s2));o/p : true after change by override
		System.out.println(s1.equals(s2));
	}
}

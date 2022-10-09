package com.SB101;

public class _4Demo {
public static void main(String[] args) {
		
		_4Student s2 = new _4Student(10,"N1",500);
		_4Student s3 = new _4Student(10,"N1",500);
		
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s2.hashCode1());
		System.out.println(s3.hashCode1());
		//Ideally when both hashCode number will be equal only when equals method will return true;
		//System.out.println(s2.equals(s3));
	}

}

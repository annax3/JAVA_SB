package com.Day3Revision;

public class _2Demo {
	_1Intr fun1() {
		//Method Definition
		System.out.println("Inside fun1 of Demo 2");
		//return null; 
		//or
		//return new _1Intrimpl();
		//or
		//_1Intr i1 = new _1Intrimpl();
		//return i1;
		
		return s->System.out.println("Welcome to LE :"+s);
	}
	public static void main(String[] args) {
		_2Demo d1=new _2Demo();
		_1Intr i2 = d1.fun1();
		i2.printSomeThing("Ravi");
	}
}

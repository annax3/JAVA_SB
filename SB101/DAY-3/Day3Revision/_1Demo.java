package com.Day3Revision;

public class _1Demo {
	void fun1(_1Intr i1) {
		if(i1!=null) {
			System.out.println("Inside Fun1 od Demo");
			i1.printSomeThing("Lalu");
		}
		else System.out.println("Null is Not Allowed");
	}
	public static void main(String[] args) {
		_1Demo d1=new _1Demo();
		//d1.fun1(null);
		//d1.fun1(new _1Intrimpl());
		
		//_1Intr i1=s->System.out.println("Welcome Using LE:"+s);
		//i1.printSomeThing("Beta Papu");
		//d1.fun1(i1);
		d1.fun1(s->System.out.println("Welcome using LE "+s));
	}
}

package com.Preclass;

@FunctionalInterface
interface X{
	//Abstract method should be one Than only be considered Functional Interface
	void sayHello(String name);	
}
//Here we implement through external inner class and then we applied this external class in comment 1
//BUt we can skip this external class and use anonymous class so we can avoid this external class implementation
//see in next class
class ximple implements X{

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println("Welcome :"+name);
		
	}
	
}
public class _1FunctionalProg {
	public static void main(String[] args) {
		X x1=new ximple(); //comment 1: x1 interface object ximple is interface class object
		x1.sayHello("Prashant");
	}
}
//To work with Functional Programming we need Functional interface in java
//with the help of functional interface we can achieve functional programming in java
//using Lambda Expression
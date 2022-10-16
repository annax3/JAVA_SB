package com.LoveClassMR;


public class _1DemoMr {
	public static void fun1(String s) {
		System.out.println("Inside fun1 DemoMr");
		System.out.println("the value of S is : "+s);
	}
	
   public void fun2(String s) {
		
		System.out.println("inside non-static fun2 of Demo ");
		System.out.println("The value of s is :"+s);
		
	}
   
   public _1DemoMr(String s) {
		
		System.out.println("inside Constructor of Demo ");
		System.out.println("The value of s is :"+s);
		
		
	}

	public static void main(String[] args) {
		_1IntrMR i1 =  _1DemoMr::fun1;	//Referring to static method
		_1IntrMR i2 = new _1DemoMr("amit")::fun2; // Referring to non-static method
		i1.sayHello("Welcome to MR");
		i2.sayHello("Welcome to MR");
		_1IntrMR i3 = _1DemoMr::new; //Referring to the constructor
		i3.sayHello("Welcome to MR");

		 	
}
}

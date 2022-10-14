package com.Preclass;

@FunctionalInterface //this annotation ensures that it is correct it show error if something wrong happen
interface X{
	//void fun1(); error because function interface only have one abstract interface buy we can use default method
	void sayHello(String name);	
	
}

public class _2FunctionalPr {
public static void main(String[] args) {
		//using external class
		X x1=new ximple(); //comment 1: x1 interface object ximple is interface class object
		x1.sayHello("Prashant");
		//using anonymous class
		X x2=new X() {
			@Override
			public void sayHello(String name) {
				// TODO Auto-generated method stub
				System.out.println("Hi "+name);
			}			
		};
		x2.sayHello("Ram");
		
		//Using Lambda Expression
		
	    X x3=(String name) -> {
		System.out.println("Good morning :"+name);
	    };
	    x3.sayHello("hello..");
	    
	    X x4=(name)->{
	    	System.out.println("hello wonderland :"+name);
	    };
	    x4.sayHello("LALA");
	    
	    X x5=  n->System.out.println("jiyo or jeene do :"+ n);
	    x5.sayHello("Bro");
}
}
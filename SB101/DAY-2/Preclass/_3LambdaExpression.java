package com.Preclass;

@FunctionalInterface 
interface X1{
	void sayHello(String name,int age);		
}

public class _3LambdaExpression {
	public static void main(String[] args) {
		 X1 x5=(n,a)->{
		 System.out.println("Hello :"+ n);
		 System.out.println("Your age is : "+ a);
		 };
		    x5.sayHello("Bro",27);
	}
}

package com.LiveClassFp;

public class _5Demo {
	public static void main(String[] args) {
		_4Intr i1=new _4IntrImpl();
//		String result = i1.sayHello("Rahul");
//		System.out.println(result);
		System.out.println(i1.sayHello("rahul"));
		
		//using Lambda Expression
		_4Intr i2 = name ->{
			String result = "Welcome :"+name.toLowerCase();
			return result;//if you want to return use curly braces
		};
		System.out.println(i2.sayHello("AMIT"));
		
		
		_4Intr i3 =name -> "Welcome :"+name.toLowerCase();//it is like a return by default
		System.out.println(i3.sayHello("GUJJU"));
		}
}

package com.LiveClassFp;

public class _3Demo {
	public static void main(String[] args) {
		_2Intr i2 = (String name,int age)->{//Data type is optional String and int
			System.out.println("name is : "+name+" "+"Age is :"+age);
		};
		i2.sayHello("Anna", 27);
		
		_2Intr i3 =(naam,umar)->System.out.println("Name is :"+naam+" "+"Age is :"+umar);
		i3.sayHello("Anand", 28);
	}
}

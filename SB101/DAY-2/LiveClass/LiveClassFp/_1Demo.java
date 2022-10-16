package com.LiveClassFp;

public class _1Demo {
	public static void main(String[] args) {
		//using External class
		_1Intr i1=new _1IntrImp();
		i1.sayHello("Ram");
		//Using Anonymous inner class
		_1Intr i2 =new _1Intr()	{

			@Override
			public void sayHello(String name) {
				// TODO Auto-generated method stub
				System.out.println("Using Anonymous inner class "+ name);
			}
			
		};//Anonymous inner class this block is used as class
		i2.sayHello("Nandu");
		
		//Using Lambda Expression
		_1Intr i3 = n -> System.out.println("Welcome using LE : "+n);
		i3.sayHello("Ram");
	}
}

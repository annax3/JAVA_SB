package com.day3;

import java.util.function.Consumer;

public class _1DemoConsumer {
	public static void main(String[] args) {
//		Consumer<String> c1=new _1Myconsumer();
//		c1.accept("Ravi");
//		
//		//LE
//		Consumer<String> c2=s->System.out.println("Welcome using LE"+s);
//		c2.accept("Amit");
		
		Consumer<_9StudentBean> c1 = new _1Myconsumer();
		c1.accept(new _9StudentBean(10, "Ram", 800));
		
		
		Consumer<_9StudentBean> c2= s -> {
			
			System.out.println("Roll is :"+s.getRoll());
			System.out.println("Name is :"+s.getName());
			System.out.println("Marks is :"+s.getMarks());
			
		};
		
		c2.accept(new _9StudentBean(10, "Ram", 800));
	};
}

package com.day3;

import java.util.function.Consumer;

public class _1Myconsumer implements Consumer<_9StudentBean>{

	@Override
	public void accept(_9StudentBean s) {
		// TODO Auto-generated method stub
		System.out.println("Roll is :"+s.getRoll());
		System.out.println("Name is :"+s.getName());
		System.out.println("Marks is :"+s.getMarks());
		
	}

}

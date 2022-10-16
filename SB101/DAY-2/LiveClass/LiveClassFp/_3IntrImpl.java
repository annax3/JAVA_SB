package com.LiveClassFp;

import com.LiveClass._9StudentBean;

public class _3IntrImpl implements _3IntrStudent{

	@Override
	public void sayHello(_9StudentBean Student) {
		// TODO Auto-generated method stub
		System.out.println("Roll no  is "+ Student.getRoll());
		System.out.println("Name  is "+ Student.getName());
		System.out.println("Marks  is "+ Student.getMarks());
	}
	
}

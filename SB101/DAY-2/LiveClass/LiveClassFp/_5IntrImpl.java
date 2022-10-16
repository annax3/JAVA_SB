package com.LiveClassFp;

import com.LiveClass._9StudentBean;

public class _5IntrImpl implements _5Intr{

	@Override
	public _9StudentBean getStudent(int roll, String name, int marks) {
		// TODO Auto-generated method stub
		_9StudentBean s1 = new _9StudentBean(roll, name.toUpperCase(),marks+100);
		return s1;
	}
	
}

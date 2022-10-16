package com.LiveClassFp;

import com.LiveClass._9StudentBean;

public class _4Demo {
	public static void main(String[] args) {
		_3IntrStudent i1 = new _3IntrImpl();
		i1.sayHello(new _9StudentBean(10,"Pummy",850));
		
		//_3IntrStudent i2 = (_9StudentBean Student)->{} skip the data type _9StudentBena
	     _3IntrStudent i2 =s->{
	    	 System.out.println("ROll no is "+s.getRoll());
	    	 System.out.println("Name is "+s.getName());
	    	 System.out.println("Marks  is "+s.getMarks());
	     };
	     i2.sayHello(new _9StudentBean(10,"Rahul",700));
	} 
}

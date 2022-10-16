package com.LiveClassFp;

import com.LiveClass._9StudentBean;

public class _6Demo {
	public static void main(String[] args) {
		_5Intr i1=new _5IntrImpl();
		_9StudentBean s=i1.getStudent(10, "Amit", 500);
		System.out.println(s);
//		_5Intr i2 = (int roll,String name,int marks)->{
//			_9StudentBean s1=new _9StudentBean(roll ,name.toUpperCase(),marks+100);
//			return s1;
//		};
		//no need to write Data types 
		_5Intr i2 = (roll, name, marks)-> new  _9StudentBean(roll ,name.toUpperCase(),marks+100);
		     _9StudentBean	 s1      =  i2.getStudent(10, "Anmol", 200);
		     System.out.println(s1);
			
		
	}
}
 
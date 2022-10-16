package com.day3;

import java.util.ArrayList;
import java.util.List;

public class _2forEachExampleList {
	public static void main(String[] args) {
    List<_9StudentBean> students = new ArrayList<>();
		
		students.add(new _9StudentBean(10, "N1", 780));
		students.add(new _9StudentBean(12, "N2", 480));
		students.add(new _9StudentBean(13, "N3", 380));
		students.add(new _9StudentBean(14, "N4", 880));
		students.add(new _9StudentBean(15, "N5", 680));
		students.add(new _9StudentBean(16, "N6", 720));
		
		
		students.forEach(s -> {
			
			System.out.println("Roll is :"+s.getRoll());
			System.out.println("Name is :"+s.getName());
			System.out.println("Marks is :"+s.getMarks());
			
			System.out.println("============================");
			
		});
	}
}

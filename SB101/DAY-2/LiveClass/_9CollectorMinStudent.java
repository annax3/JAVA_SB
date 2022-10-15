package com.LiveClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _9CollectorMinStudent {
	public static void main(String[] args) {
		List<_9StudentBean> students = new ArrayList<>();
		students.add(new _9StudentBean(0, "N1", 520));
		students.add(new _9StudentBean(12, "N2", 550));
		students.add(new _9StudentBean(6, "N3", 480));
		students.add(new _9StudentBean(5, "N4", 400));
		students.add(new _9StudentBean(14, "N5", 600)); 
		students.add(new _9StudentBean(15, "N6", 520));
		
		_9StudentBean student = Collections.min(students , new _9StudentmarkComp());
		System.out.println(student);
		_9StudentBean student1 = Collections.max(students , new _9StudentmarkComp());
		System.out.println(student1);
	}
}

package com.Day3Revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _1List {
public static void main(String[] args) {

		
		List<_9StudentBean> students= new ArrayList<>();
		
		students.add(new _9StudentBean(1, "N1", 500));
		students.add(new _9StudentBean(4, "N2", 400));
		students.add(new _9StudentBean(5, "N3", 600));
		students.add(new _9StudentBean(3, "N4", 800));
		students.add(new _9StudentBean(2, "N5", 700));
			
		
		//Using Anonymous Class
		Collections.sort(students,new Comparator<_9StudentBean>() {

			@Override
			public int compare(_9StudentBean s1, _9StudentBean s2) {
				// TODO Auto-generated method stub
				return s1.getMarks()>s2.getMarks() ? +1 : -1;
			}
		});
		
		//Using LE Short way
		Collections.sort(students,(s1,s2) -> s1.getMarks() > s2.getMarks() ? +1 : -1);
		
		
		//Using LE Long way
//		Collections.sort(students,(s1,s2) -> {
//			return s1.getMarks() > s2.getMarks() ? +1 : -1;
//		});
		
		
	}
}

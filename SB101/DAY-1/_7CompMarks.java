package com.SB101;

import java.util.TreeSet;

public class _7CompMarks {
	public static void main(String[] args) {
		_7StudentMarksComp mcomp=new _7StudentMarksComp();
		TreeSet<_5Student> ts2= new TreeSet<>(mcomp);
		
		ts2.add(new _5Student(10, "N1", 520));
		ts2.add(new _5Student(12, "N2", 550));
		ts2.add(new _5Student(6, "N3", 480));
		ts2.add(new _5Student(5, "N4", 400));
		ts2.add(new _5Student(14, "N5", 600));
		ts2.add(new _5Student(10, "N6", 520));
		System.out.println(ts2);
		
	}
}

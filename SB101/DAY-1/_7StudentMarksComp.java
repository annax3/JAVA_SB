package com.SB101;

import java.util.Comparator;

public class _7StudentMarksComp implements Comparator<_5Student> {

	@Override
	public int compare(_5Student s1, _5Student s2) {
		// TODO Auto-generated method stub
		return s1.getMarks()>s2.getMarks()?+1:-1;
	}

}
/*
 Comparator(I):
==========

--this interface belongs to java.util package.
--this Comparator interface also has only one method:

public int compare(Object obj1,Object obj2);



--using this comparator we can define the sorting logic of a class objects outside that class.

--using Comparator we can define multiple sorting logic also.

 */

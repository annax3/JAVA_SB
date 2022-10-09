package com.SB101;

import java.util.Comparator;

public class _8StudentRollComp implements Comparator<_5Student> {

	@Override
	public int compare(_5Student s1, _5Student s2) {
		// TODO Auto-generated method stub
//		return s1.getRoll() > s2.getRoll() ? +1 : -1;
		if(s1.getMarks() > s2.getMarks())
			return +1;
		else if(s1.getMarks() < s2.getMarks())
			return -1;
		else
			return s1.getName().compareTo(s2.getName());
	}
}

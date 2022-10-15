package com.LiveClass;

import java.util.Comparator;

public class _9StudentmarkComp implements Comparator<_9StudentBean> {

	@Override
	public int compare(_9StudentBean s1, _9StudentBean s2) {
		// TODO Auto-generated method stub
		if(s1.getMarks()>s2.getMarks()) return +1;
		else if(s1.getMarks()<s2.getMarks()) return -1;
		else return s1.getName().compareTo(s2.getName());
	}

}

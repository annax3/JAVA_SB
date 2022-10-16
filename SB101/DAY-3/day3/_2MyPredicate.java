package com.day3;

import java.util.function.Predicate;

import com.Day3Revision._9StudentBean;

public class _2MyPredicate implements Predicate<_9StudentBean>{
 
	@Override
	public boolean test(_9StudentBean s) {
		// TODO Auto-generated method stub
		
//		if(s.getMarks()>700) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return s.getMarks()>700;
	}

}

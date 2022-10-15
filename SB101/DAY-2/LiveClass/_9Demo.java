package com.LiveClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class _9Demo {
	public static void main(String[] args) {
		List<_9StudentBean> students = new ArrayList<>();
		students.add(new _9StudentBean(0, "N1", 520));
		students.add(new _9StudentBean(12, "N2", 550));
		students.add(new _9StudentBean(6, "N3", 480));
		students.add(new _9StudentBean(5, "N4", 400));
		students.add(new _9StudentBean(14, "N5", 600)); 
		students.add(new _9StudentBean(15, "N6", 520));
		//TreeSet<_9StudentBean> ts = new TreeSet<>(students);
		//System.out.println(ts);
		//This is sort by roll number by we don't want this we want to sort 
		//by whole list
		_9StudentmarkComp mcomp = new _9StudentmarkComp();
		//_9StudentRollComp rcomp = new _9StudentRollComp();
		Collections.sort(students, mcomp);
		System.out.println(students);
//		Collections.sort(students, rcomp);
//		System.out.println(students);
	}	
}
/*

TreeSet:
=======

--if we try to add any elements inside the TreeSet, that element
must be comparable. otherwise we get a ClassCastException.

java.lang.Comparable is an interface which have only method:

public int compareTo(Object obj);

--if we try to add any element inside the TreeSet class then that element 
class must implements the Comparable interface and define the 
sorting logic of that object by overriding compareTo method.


Note: all the Wrapper classes and String class internally implements
Comparable interface.


 Note: to consider the duplicate element, HashSet and LinkedHashSet class uses equal() and 
 hashCode() method internally, where as TreeSet class uses compareTo or compare() method.
*/
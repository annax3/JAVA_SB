package com.SB101;

import java.util.TreeSet;

public class _6TreSet {
	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(10);
		//duplicates are not allowed because it comes from the set family
		
		System.out.println(ts);//[10,20,30,40]
		TreeSet<String> ts1=new TreeSet<>();
		ts1.add("ten");
		ts1.add("twenty");
		ts1.add("three");
		ts1.add("four");
		ts1.add("ten");
		//duplicates are not allowed because it comes from the set family
		
		System.out.println(ts1);
		
		/*
        TreeSet<_5Student> ts2= new TreeSet<>();
		
		ts2.add(new _5Student(10, "N1", 520));
		ts2.add(new _5Student(12, "N2", 550));
		ts2.add(new _5Student(6, "N3", 480));
		ts2.add(new _5Student(5, "N4", 400));
		ts2.add(new _5Student(14, "N5", 600));
		ts2.add(new _5Student(15, "N6", 520));
		System.out.println(ts2);
		
		TreeSet:
                =======
                => if we try to add any elements inside the TreeSet, that element
                must be comparable. otherwise we get a ClassCastException.

                java.lang.Comparable is an interface which have only method:

                public int compareTo(Object obj);
                
                => if we try to add any element inside the TreeSet class then that element 
                  class must implements the Comparable interface and define the 
                  sorting logic of that object by overriding compareTo method.
                  
               Note**: all the Wrapper classes and String class internally implements
                     Comparable interface.


               Note: to consider the duplicate element, HashSet and LinkedHashSet class uses equal() and hashCode() method internally, where as TreeSet class uses compareTo or compare() method.
   
		*/
        TreeSet<_5Student> ts2= new TreeSet<>();
		
		ts2.add(new _5Student(10, "N1", 520));
		ts2.add(new _5Student(12, "N2", 550));
		ts2.add(new _5Student(6, "N3", 480));
		ts2.add(new _5Student(5, "N4", 400));
		ts2.add(new _5Student(14, "N5", 600));
		ts2.add(new _5Student(15, "N6", 520));
		System.out.println(ts2);
		
		
	}
}

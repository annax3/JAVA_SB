package com.SB101;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class _5Prob1 {
	public static void main(String[] args) {
		List<_5Student> students= new ArrayList<_5Student>();
		students.add(new _5Student(10,"N1",500));
		students.add(new _5Student(11,"N2",400));
		students.add(new _5Student(12,"N3",600));
		students.add(new _5Student(13,"N4",800));
		students.add(new _5Student(10,"N1",500));
		        
		System.out.println(students.size());//5
		
	 	
		        //converting List to Set in set duplicate are not allowed
				Set<_5Student> uniqueStudents = new LinkedHashSet<>(students);

				
				//converting Set to List
				students = new ArrayList<_5Student>(uniqueStudents);
				
				System.out.println(students.size()); //4
		
		
		
		
	}
}

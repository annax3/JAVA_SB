package com.SB101;
import java.util.*;

public class _1Demo {
	public static void main(String[] args) {
		System.out.println("Welcome to SB101...");
		
		//List<_2Student> students=new ArrayList<_2Student>(); o/p : 5
		//Set<_2Student> students=new HashSet<_2Student>(); o/p : 5 When we not generate equals hash code method
		//Set<_2Student> students=new HashSet<_2Student>(); o/p : 4 after we generate Hascode equals
		Set<_2Student> students=new HashSet<_2Student>()
		students.add(new _2Student(10,"N1",500));
		students.add(new _2Student(12,"N2",600));
		students.add(new _2Student(13,"N3",700));
		students.add(new _2Student(14,"N4",800));
		students.add(new _2Student(10,"N1",500));
		System.err.println(students.size());
	}
}

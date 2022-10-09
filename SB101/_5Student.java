package com.SB101;

import java.util.Objects;

public class _5Student implements Comparable{
	private int roll;
	private String name;
	private int marks;
	
	public _5Student() {
		// TODO Auto-generated constructor stub
	}
	
	public _5Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		return Objects.hash(marks, name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		_5Student other = (_5Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && roll == other.roll;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}


	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		//I want to write my own sorting technique
		
		//Sorting :
		_5Student s1=this;
		_5Student s2=(_5Student)obj;
		if(s1.getMarks() > s2.getMarks())
			return +1;
		else if(s1.getMarks() > s2.getMarks())
			return -1;
		else
			return 0;
		
//		return this.getMarks() > s2.getMarks() ? +1 : -1;
		
	}

}

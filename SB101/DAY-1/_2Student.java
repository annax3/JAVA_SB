package com.SB101;

import java.util.Objects;

public class _2Student {
	private int roll;
	private String name;
	private int marks;
	
	public _2Student() {
		// TODO Auto-generated constructor stub
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
		_2Student other = (_2Student) obj;
		return marks == other.marks && Objects.equals(name, other.name) && roll == other.roll;
	}




	public _2Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}




	@Override
	public String toString() {
		return "_2Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
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

}

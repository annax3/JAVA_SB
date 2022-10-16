package com.day3;

public class _9StudentBean implements Comparable<_9StudentBean>{
	private int roll;
	private String name;
	private int marks;
	
	public _9StudentBean() {
		
	}
	
	
	public _9StudentBean(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
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
	public int compareTo(_9StudentBean s2) {
		// TODO Auto-generated method stub
		if(this.getMarks()>s2.getMarks()) {
			return +1;
		}
		else return -1;
	}


	@Override
	public String toString() {
		return "_9StudentBean [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
}

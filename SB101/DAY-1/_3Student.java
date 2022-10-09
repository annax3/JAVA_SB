package com.SB101;

public class _3Student {
	private int roll;
	private String name;
	private int marks;
	
	public _3Student() {
		// TODO Auto-generated constructor stub
	}

	
	
	public _3Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	//In case we are not satisfied with the parent class behavior then we can override 
	public boolean equals(Object obj) {
        //return (this == obj); before
		//this => current object
		_3Student s1=this;
		_3Student s2=(_3Student)obj;
		
		return (s1.getRoll()==s2.getRoll() && s1.getName().equals(s2.getName())&&s1.getMarks()==s2.getMarks());
		
    }


	@Override
	public String toString() {
		return "_3Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
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

package com.SB101;

import java.util.Objects;

public class _4Student {
		private int roll;
		private String name;
		private int marks;
		
		public _4Student() {
			// TODO Auto-generated constructor stub
		}

		
		
		public _4Student(int roll, String name, int marks) {
			super();
			this.roll = roll;
			this.name = name;
			this.marks = marks;
		}



		@Override
		public int hashCode() {
			return roll;
		}



		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			_4Student other = (_4Student) obj;
			return marks == other.marks && Objects.equals(name, other.name) && roll == other.roll;
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
		
		public int hashCode1() {
			return Objects.hash(roll,name,marks);
		}
	

}

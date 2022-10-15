package com.LiveClass;

@FunctionalInterface
public interface _1Intr {
	public static int x =100; // it is by default public static final
	public abstract void fun1();//it is by default public and abstract whether 
	//you mention or not
	
	public default void fun2() {
		
	}
	public static void fun3() {
		
	}
	
	public abstract String toString();
}

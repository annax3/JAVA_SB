package com.LoveClassMR;

public class _3DemoMr4 {
	public static void main(String[] args) {
		_3IntrMR i1=S -> System.out.println(S);//Using Le
		i1.printSomething("Hello");
		_3IntrMR i2 =System.out::println;//Referring  printMMethod oof PrintStream 
		i2.printSomething("Welcome");
	}
}

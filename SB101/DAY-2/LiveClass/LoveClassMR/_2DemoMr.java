package com.LoveClassMR;


public class _2DemoMr {
	public static void main(String[] args) {
		_2IntrMR i1 = (String number)->{
			int result= Integer.parseInt(number);
			return result;
			
		};
	     System.out.println(i1.getTheNumber("100")+50);
	     
	   _2IntrMR i2=number->Integer.parseInt(number); 
	   System.out.println(i2.getTheNumber("140")+50);
	   
	   _2IntrMR i3 =Integer::parseInt;// Referring to the parseInt method of Integer class	
	   System.out.println(i3.getTheNumber("160")+50);
	   
	}
}

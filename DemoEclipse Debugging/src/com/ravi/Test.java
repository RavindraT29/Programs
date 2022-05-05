package com.ravi;

public class Test {

	public static void main(String[] args) {
	  System.out.println("START");
	   int a = 10;
	   show();
	   a=a++ + ++a  -  ++a +  a++;
	   if(a>55) {
		   
		   System.out.println("VALID");
	   }else {
		   System.out.println("INVALD");
	   }
	   System.out.println("DONE");

	}
	 public static void show() {
	 
	 System.out.println("FROME show method");
	 int k=8;
	 k= k--  + ++k + k++;
	 System.out.println("Dat is"+ k);
	 System.out.println("About to exist");
	 }
}

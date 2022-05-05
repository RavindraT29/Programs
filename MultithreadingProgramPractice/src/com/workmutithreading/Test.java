package com.workmutithreading;

public class Test extends Thread{ 
	
	  public void run() {
		  
		  for(int i=0; i<10;i++) {
			  
			  System.out.println("Child thread");
		  }
	  }
	
	public static void main(String args[]) {
		
		Test obj = new Test();
		obj.start();
		
		for(int i=0;i<10;i++) {
			
			System.out.println("main method");
		}
		
		
	}

}

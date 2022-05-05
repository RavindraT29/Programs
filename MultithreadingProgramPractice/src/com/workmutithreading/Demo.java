package com.workmutithreading;

public  class Demo implements Runnable{
	
	  public void run() {
		     
		  System.out.println("Thread 2");
		  
	  }

	public static void main(String[] args) {
		
		Demo d=new Demo();
		Thread t= new Thread(d);
		t.start();

	}

}

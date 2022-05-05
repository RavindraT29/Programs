package com.springcore.ref;

public class A {
	private int x;
	private B obj;
	
	
	// Geter and seter method
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getObj() {
		return obj;
	}
	// constructor
	public void setObj(B obj) {
		this.obj = obj;
	}
	public A() {
		super();
		
	}
	
	// toString method
	@Override
	public String toString() {
		return "A [x=" + x + ", obj=" + obj + "]";
	}
	
	

}

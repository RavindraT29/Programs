package com.springcore.lifecycle;

public class RJoylibi {
	private double price;

	
	// Getter and Seater method
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public RJoylibi() {
		super();
		
	}

	@Override
	public String toString() {
		return "RJoylibi [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("inside init method  : hey how are you?");
	}
	public void destroy() {
		
		System.out.println("inside destroy method : bye bye i am going to die");
	}
	

}

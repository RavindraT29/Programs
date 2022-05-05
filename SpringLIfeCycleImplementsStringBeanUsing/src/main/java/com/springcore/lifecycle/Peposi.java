package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Peposi  implements InitializingBean, DisposableBean{
	private double price;

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Peposi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// init
		System.out.println("taking pepsi: init");
		
	}

	@Override
	public void destroy() throws Exception {
		// Destory 
		System.out.println("Going to put bottle back to shop: destroy");
		
	}
	
	
	

}

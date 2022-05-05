package com.design;

public class LaptopFactory {
	
	public Laptop getNewLaptop(String str) {
		if(str.equals("Secured"))
			return new AppletLaptop();
		else if(str.equals("Ordered"))
			return new DellLaptop();
		else
			return new HPLaptop();
		 
		
	}

}

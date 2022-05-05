package com.design;

public class FactoryMain {

	public static void main(String[] args) {
		
		LaptopFactory  aLF =  new LaptopFactory();
		Laptop aLaptop = aLF.getNewLaptop("Secured");
		aLaptop.laptopSepc();

	}

}

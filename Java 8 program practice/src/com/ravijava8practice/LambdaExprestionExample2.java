package com.ravijava8practice;
interface Addable{
	int add(int a, int b);
}
public class LambdaExprestionExample2 {

	public static void main(String[] args) {
		
		 // Multiple parameters in lambda expression 
		
		Addable d2=(a,b)->(a+b);
		System.out.println(d2.add(10, 20));
		
		// Multiple parameters with data type in lambda expression  
		Addable d3= (int a,int b)->(a+b);
		
			System.out.println(d3.add(100, 200));
		}
		

	}



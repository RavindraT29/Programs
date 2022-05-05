package com.ravijava8practice;
interface Sayable{
	public String say(String name);
}
public class LambadaExprestionExample1 {

	public static void main(String[] args) {
		
		// Lambda expression with single parameter.
		Sayable r1=(name)->{
			return "Ravi,"+name;
		};
		System.out.print(r1.say("Sonooo"));
		
		
		// you can omit function parentheses
		
		Sayable r2= name->{
			return "Ravi,"+name;
		};
		System.out.println(r2.say("Sonoo"));

	}

}

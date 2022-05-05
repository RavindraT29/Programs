package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// Object create
	AbstractApplicationContext context=	new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycle.xml");
        
	    // bean name
	 RJoylibi  s1=(RJoylibi) context.getBean("s1");
	System.out.println(s1);
	//registering shutdown hook
	context.registerShutdownHook();
	
    System.out.println("++++++++++++++++++++++++++++++++");
    Peposi p1= (Peposi) context.getBean("p1");
    
     System.out.println(p1);
	
     System.out.println("******************************************");
	
     ExampleDemo ExampleDemo=(com.springcore.lifecycle.ExampleDemo) context.getBean("ExampleDemo1");
     System.out.println("ExampleDemo1");
	}

}

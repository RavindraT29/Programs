package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ExampleDemo {
	private String subject;

	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public ExampleDemo() {
		super();
		
	}

	@Override
	public String toString() {
		return "ExampleDemo [subject=" + subject + "]";
	}
	@PostConstruct
	public void start() {
		System.out.println("starting  method:");
	}
	@PreDestroy
	public void end() {
		System.out.println("Ending method:");
	}

}

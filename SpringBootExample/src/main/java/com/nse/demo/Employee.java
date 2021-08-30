package com.nse.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Employee {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
		//this.name="Ibraheem";
		System.out.println("Employee Object Created::::");
	}
	
	
}

package com.jspider.spring_core_tecnologies.annotation.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "laptop1")
public class Laptop {
	@Value(value = "3454235")
	private int id;
	@Value(value = "HP")
	private String name;
	@Value(value= "852345")
	private double price;
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
	
	
	
	

}

package com.jspider.spring_core_tecnologies.annotation.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.spring_core_tecnologies.annotation.beans.Laptop;

public class LaptopController {

	public static void main(String[] args) {
		
		
		
	ApplicationContext ap= new AnnotationConfigApplicationContext(LaptopConfig.class);
		
		Laptop laptop =(Laptop) ap.getBean("laptop1");
		System.out.println(laptop.getPrice());

	}

}

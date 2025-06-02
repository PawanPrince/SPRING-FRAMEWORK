package com.jspider.spring_core_tecnologies.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.spring_core_tecnologies.beans.Customer;
import com.jspider.spring_core_tecnologies.beans.Student;

public class CustomerController {
	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("myspring.xml");
//		Customer customer = (Customer) beanFactory.getBean("customer.class");

//		String date = customer.getTodatsDate();
//		System.out.println(date);

		Student student = (Student) beanFactory.getBean("student");
		Student student1 = (Student) beanFactory.getBean("student1");

//		String name = student.getName();
//		String email = student.getEmail();

		System.out.println("Student id is: " + student.getId());
		System.out.println("Student1 id is:" + student1.getId());
//		System.out.println("Student name is: "+name);
//		System.out.println("Student email is: " +email);
	}

}
